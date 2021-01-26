package ru.nsu.sdt.interpreter

import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.objectweb.asm.ClassWriter
import org.objectweb.asm.ClassWriter.*
import org.objectweb.asm.Opcodes.*
import ru.nsu.sdt.antlr.SchemeLexer
import ru.nsu.sdt.antlr.SchemeParser

import java.io.FileOutputStream

const val generatedClassName = "ru/nsu/sdt/interpreter/SchemeGenerated"

fun interpret(code: String) {
    val parser = createParser(code)
    val parseTree = parser.parse()
    val classWriter = createClassWriter()
    SchemeVisitor(classWriter).visit(parseTree)
    classWriter.visitEnd()
    FileOutputStream("build/classes/kotlin/main/$generatedClassName.class").use {
            fos -> fos.write(classWriter.toByteArray())
    }
}

fun createParser(code: String): SchemeParser {
    val lexer = SchemeLexer(CharStreams.fromString(code))
    return SchemeParser(CommonTokenStream(lexer))
}

fun createClassWriter() = ClassWriter(COMPUTE_FRAMES or COMPUTE_MAXS).apply {
    visit(V1_8, ACC_PUBLIC or ACC_SUPER, generatedClassName, null, "java/lang/Object", null)
}
