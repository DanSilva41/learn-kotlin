package com.silva.learn_kotlin.classes

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class RectangleTest {

    @Test fun shouldCalculatePerimiter() {
        val rectangle = Rectangle(5.0, 2.0)

        assertEquals(14.0, rectangle.perimiter)
        println("The perimiter is ${rectangle.perimiter}")
    }
}