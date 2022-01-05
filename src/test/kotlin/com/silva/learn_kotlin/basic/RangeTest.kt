package com.silva.learn_kotlin.basic

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

internal class RangeTest {

    @Test
    fun shouldValidRange() {
        assertTrue { Range().verifyRange(54, 60) }
    }

    @Test
    fun shouldInvalidValidRange() {
        assertFalse { Range().verifyRange(61, 60) }
    }

    @Test
    fun shouldValidOutRange() {
        assertTrue { Range().verifyOutRange(62, 60) }
    }

    @Test
    fun shouldInvalidOutRange() {
        assertFalse { Range().verifyOutRange(50, 60) }
    }

    @Test
    fun shouldIterateRange() {
        Range().iterateRange(10)
    }

    @Test
    fun shouldIterateRangeWithProgression() {
        Range().iterateRangeProgression(10)
    }

    @Test
    fun shouldIterateRangeWithProgressionAndDownTo() {
        Range().iterateRangeProgressionDownTo(10)
    }

    @Test
    fun shouldIterateRangeWithUntil() {
        var finalValue = 0
        for (i in 1 until 100) finalValue = i
        assertEquals(99, finalValue)
    }
}