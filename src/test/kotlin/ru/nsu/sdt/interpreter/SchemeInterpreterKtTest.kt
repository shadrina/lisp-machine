package ru.nsu.sdt.interpreter

import org.junit.jupiter.api.Test
import java.lang.reflect.Method

internal class SchemeInterpreterKtTest {
    @Test
    fun simple() {
        interpret("""
(define (factorial x)
  (if (#t) 123 0))
    """.trimIndent())
        val cls = Class.forName("ru.nsu.sdt.interpreter.SchemeGenerated")
        val method: Method = cls.getDeclaredMethod("factorial", Object::class.java)
        val returnValue = method.invoke(null, 123)
        assert(returnValue == 123)
    }

    @Test
    fun simple2() {
        interpret("""
(define (factorial x)
  (if (#t) 1 0))
    """.trimIndent())
    }
}