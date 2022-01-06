package com.silva.learn_kotlin.functions

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
}