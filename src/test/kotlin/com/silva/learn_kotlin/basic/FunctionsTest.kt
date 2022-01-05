package com.silva.learn_kotlin.basic

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class FunctionsTest {

    @Test
    fun shouldNotReturnAnythingWithUnit() {
        val result = Functions().returnNothingWithUnit()
        assertEquals(Unit, result)
    }

    @Test
    fun shouldNotReturnAnything() {
        val result = Functions().returnNothing()
        assertEquals(Unit, result)
    }
}