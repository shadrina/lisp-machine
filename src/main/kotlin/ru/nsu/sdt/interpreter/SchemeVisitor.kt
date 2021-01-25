package ru.nsu.sdt.interpreter

import jdk.internal.org.objectweb.asm.Opcodes.*
import org.objectweb.asm.ClassVisitor
import ru.nsu.sdt.antlr.SchemeBaseVisitor
import ru.nsu.sdt.antlr.SchemeParser

class SchemeVisitor(private val classVisitor: ClassVisitor) : SchemeBaseVisitor<Unit>() {
    private val mainMethodVisitor =
        classVisitor.visitMethod(ACC_PUBLIC + ACC_STATIC, "main", "([Ljava/lang/String;)V", null, null)

    override fun visitParse(ctx: SchemeParser.ParseContext?) {
        mainMethodVisitor.visitCode()
        visitChildren(ctx)
        mainMethodVisitor.visitInsn(RETURN);
        mainMethodVisitor.visitMaxs(0, 0);
        mainMethodVisitor.visitEnd();
    }
}