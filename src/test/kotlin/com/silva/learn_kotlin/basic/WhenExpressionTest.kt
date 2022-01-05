package com.silva.learn_kotlin.basic

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class WhenExpressionTest {

    @Test
    fun shouldReturnTheStringOne() {
        assertEquals("One", WhenExpression().describe(1))
    }

    @Test
    fun shouldReturnTheStringGreeting() {
        assertEquals("Greeting", WhenExpression().describe("Hello"))
    }

    @Test
    fun shouldReturnTheStringLong() {
        assertEquals("Long", WhenExpression().describe(1L))
    }

    @Test
    fun shouldReturnTheStringNotAString() {
        assertEquals("Not a string", WhenExpression().describe(true))
    }

    @Test
    fun shouldReturnTheStringUnknown() {
        assertEquals("Unknown", WhenExpression().describe("hello"))
    }
}