package ru.nsu.sdt.interpreter

import jdk.internal.org.objectweb.asm.Opcodes.*
import org.objectweb.asm.ClassVisitor
import org.objectweb.asm.Label
import org.objectweb.asm.MethodVisitor
import org.objectweb.asm.Opcodes
import ru.nsu.sdt.antlr.SchemeBaseVisitor
import ru.nsu.sdt.antlr.SchemeParser

class SchemeVisitor(private val classVisitor: ClassVisitor) : SchemeBaseVisitor<Unit>() {
    companion object {
        private const val BIPUSH_MAX = 128
        private const val SIPUSH_MAX = 32768
    }

    private val mainMethodVisitor =
        classVisitor.visitMethod(ACC_PUBLIC + ACC_STATIC, "main", "([Ljava/lang/String;)V", null, null)
    private var currentMethodVisitor = mainMethodVisitor
    private val userDefinedFunctions = mutableMapOf<String, Int>()

    override fun visitParse(ctx: SchemeParser.ParseContext?) {
        mainMethodVisitor.visitCode()
        visitChildren(ctx)
        mainMethodVisitor.visitInsn(RETURN)
        mainMethodVisitor.visitMaxs(0, 0)
        mainMethodVisitor.visitEnd()
    }

    override fun visitDefinition(ctx: SchemeParser.DefinitionContext?) {
        ctx ?: return
        val name = ctx.variable().text
        val argsCount = ctx.defFormals().variable().size
        userDefinedFunctions[name] = argsCount
        val descriptor = "(${"Ljava/lang/Object;".repeat(argsCount)})Ljava/lang/Object;"
        val methodVisitor =
            classVisitor.visitMethod(ACC_PUBLIC + ACC_STATIC, name, descriptor, null, null)
        methodVisitor.visitCode()

        currentMethodVisitor = methodVisitor
        ctx.body().accept(this)
        methodVisitor.visitInsn(ARETURN)
        methodVisitor.visitMaxs(0, 0)
        methodVisitor.visitEnd()
        currentMethodVisitor = mainMethodVisitor
    }

    override fun visitConditional(ctx: SchemeParser.ConditionalContext?) {
        ctx ?: return
        ctx.test().accept(this)
        unboxInt()
        currentMethodVisitor.visitInsn(ICONST_0);
        val elseLabel = Label()
        currentMethodVisitor.visitJumpInsn(IF_ICMPEQ, elseLabel)
        ctx.consequent().accept(this)
        val nextLabel = Label()
        currentMethodVisitor.visitJumpInsn(GOTO, nextLabel)
        currentMethodVisitor.visitLabel(elseLabel)
        ctx.alternate().accept(this)
        currentMethodVisitor.visitLabel(nextLabel)
    }

    override fun visitSelfEvaluating(ctx: SchemeParser.SelfEvaluatingContext?) {
        ctx ?: return
        when {
            ctx.STRING() != null -> {
                val content = ctx.STRING().text
                currentMethodVisitor.visitLdcInsn(content)
            }
            else -> visitChildren(ctx)
        }
    }

    override fun visitNumber(ctx: SchemeParser.NumberContext?) {
        ctx ?: return
        when (val value = ctx.text.toInt()) {
            0 -> currentMethodVisitor.visitInsn(ICONST_0)
            1 -> currentMethodVisitor.visitInsn(ICONST_1)
            2 -> currentMethodVisitor.visitInsn(ICONST_2)
            3 -> currentMethodVisitor.visitInsn(ICONST_3)
            4 -> currentMethodVisitor.visitInsn(ICONST_4)
            5 -> currentMethodVisitor.visitInsn(ICONST_5)
            else -> if (value >= -BIPUSH_MAX && value < BIPUSH_MAX) {
                currentMethodVisitor.visitIntInsn(BIPUSH, value)
            } else if (value >= -SIPUSH_MAX && value < SIPUSH_MAX) {
                currentMethodVisitor.visitIntInsn(SIPUSH, value)
            } else {
                currentMethodVisitor.visitLdcInsn(value)
            }
        }
        boxInt()
    }

    override fun visitBool(ctx: SchemeParser.BoolContext?) {
        ctx ?: return
        if (ctx.TRUE() != null) {
            currentMethodVisitor.visitInsn(ICONST_1)
        } else {
            currentMethodVisitor.visitInsn(ICONST_0)
        }
        boxInt()
    }

    private fun boxInt() = currentMethodVisitor.visitMethodInsn(
        Opcodes.INVOKESTATIC,
        "java/lang/Integer",
        "valueOf",
        "(I)Ljava/lang/Integer;",
        false
    )

    private fun unboxInt() =
        currentMethodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/Integer", "intValue", "()I", false)
}