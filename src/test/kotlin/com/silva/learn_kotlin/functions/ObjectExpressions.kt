package com.silva.learn_kotlin.functions

import com.silva.learn_kotlin.basic.Color
import org.junit.jupiter.api.Test

internal class ObjectExpressions {

    @Test
    fun shouldCreateAnonumoutsObjects() {
        val helloWorldObject = object {
            val hello = "Hello"
            val world = "World"

            override fun toString() = "$hello $world"
        }

        println(helloWorldObject)
    }

    @Test
    fun shouldCreateExtensionFunction() {
        val list = mutableListOf(1, 2, 3)
        list.swap(0, 2)
        println(list)
    }

    fun MutableList<Int>.swap(index1: Int, index2: Int) {
        val tmp = this[index1]
        this[index1] = this[index2]
        this[index2] = tmp
    }
}