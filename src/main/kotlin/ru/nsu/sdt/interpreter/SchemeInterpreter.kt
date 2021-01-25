package ru.nsu.sdt.interpreter

import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.objectweb.asm.ClassWriter
import org.objectweb.asm.ClassWriter.*
import org.objectweb.asm.Opcodes.*
import ru.nsu.sdt.antlr.SchemeLexer
import ru.nsu.sdt.antlr.SchemeParser
import java.io.IOException

import java.io.FileOutputStream

fun main() {
    interpret("""
(define (factorial x)
  (if (< x 2)
    1
    (* x (factorial (- x 1)))))
    """.trimIndent())
}

const val generatedClassName = "SchemeGenerated"

fun interpret(code: String) {
    val parser = createParser(code)
    val parseTree = parser.parse()
    val classWriter = createClassWriter()
    SchemeVisitor(classWriter).visit(parseTree)
    classWriter.visitEnd()
    try {
        FileOutputStream("$generatedClassName.class").use { fos -> fos.write(classWriter.toByteArray()) }
    } catch (e: IOException) {
        System.err.println(e.message)
    }
}

fun createParser(code: String): SchemeParser {
    val lexer = SchemeLexer(CharStreams.fromString(code))
    return SchemeParser(CommonTokenStream(lexer))
}

fun createClassWriter() = ClassWriter(COMPUTE_FRAMES or COMPUTE_MAXS).apply {
    visit(V11, ACC_PUBLIC or ACC_SUPER, generatedClassName, null, "java/lang/Object", null)
}
