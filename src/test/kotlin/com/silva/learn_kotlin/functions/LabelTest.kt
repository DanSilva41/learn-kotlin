package com.silva.learn_kotlin.functions

import org.junit.jupiter.api.Test

internal class LabelTest {

    @Test
    fun shouldShowLabelInLoops() {
        var actual = 0
        primary@ for (i in 1..4) {
            last@ for (j in 1..25) {
                ++actual
                if (i == 2 && j == 25) {
                    break@primary
                }
            }
        }

        println(actual)
    }

    @Test
    fun shouldShowReturnWithoutLabel() {
        println("Calling")
        returnWithoutLabel()
        println("Finish")
    }

    @Test
    fun shouldShowReturnWithLabel() {
        println("Calling")
        returnWithLabel()
        println("Finish")
    }

    @Test
    fun shouldShowReturnWithAutoLabel() {
        println("Calling")
        returnWithAutoLabel()
        println("Finish")
    }

    private fun returnWithoutLabel() {
        listOf(1, 2, 3, 4, 5).forEach {
            if (it == 3) return
            println(it)
        }
        println("This point is unreachable")
    }

    private fun returnWithLabel() {
        listOf(1, 2, 3, 4, 5).forEach lit@{
            if (it == 3) return@lit
            println(it)
        }
        println("done with explicit label")
    }

    private fun returnWithAutoLabel() {
        listOf(1, 2, 3, 4, 5).forEach{
            if (it == 3) return@forEach
            println(it)
        }
        println("done with auto label")
    }
}