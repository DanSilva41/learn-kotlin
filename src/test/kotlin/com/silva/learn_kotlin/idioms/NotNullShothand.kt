package com.silva.learn_kotlin.idioms

import org.junit.jupiter.api.Test
import java.io.File
import kotlin.test.assertEquals
import kotlin.test.assertNull

internal class NotNullShothand {

    @Test fun verifyNullValue() {
        val files = File("Test").listFiles()

        assertNull(files?.size)
    }

    @Test fun verifyNullValueWithElse() {
        val files = File("Test").listFiles()

        assertEquals("empty", files?.size ?: "empty")
    }
}