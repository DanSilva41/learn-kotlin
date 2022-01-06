package com.silva.learn_kotlin.types

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class DeclarativeTypesTest {

    @Test
    fun shouldLoopInString() {
        DeclarativeTypes().loopInString()
    }

    @Test
    fun shouldValidateImmutableString() {
        val str = "abcd"
        assertEquals("ABCD", str.uppercase())
        assertEquals("abcd", str)
    }

    @Test
    fun shouldShowRawString() {
        val text = """
            >for (c in "foo") println(c)
            >Other
        """.trimMargin(">").trimIndent()

        println(text)
    }
}
