package com.silva.learn_kotlin.basic

import com.silva.learn_kotlin.basic.Calculator
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class CalculatorTest {

    @Test
    fun shouldSumTwoInt() {
        val a = 10
        val b = 7
        val result = Calculator().sum(a, b)
        assertEquals(17, result)
    }

    @Test
    fun shouldSubTwoInt() {
        val a = 10
        val b = 7
        val result = Calculator().sub(a, b)
        assertEquals(3, result)
    }
}