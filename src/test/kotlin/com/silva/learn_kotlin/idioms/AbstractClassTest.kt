package com.silva.learn_kotlin.idioms

import org.junit.jupiter.api.Test

internal class AbstractClassTest {

    @Test
    fun testAbstractClass() {
        val myObject = object : AbstractClass() {
            override fun doSomething() {
                println("Something")
            }

            override fun sleep() {
                println("Sleep...")
            }
        }

        myObject.doSomething()
        myObject.sleep()
    }
}