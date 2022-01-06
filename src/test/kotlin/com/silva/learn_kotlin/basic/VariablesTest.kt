package com.silva.learn_kotlin.basic

import org.junit.jupiter.api.Test

internal class VariablesTest {

    @Test
    fun shouldCallRun() {
        Variables().run()
    }

    @Test
    fun shouldShowSnapVariables() {
        var a = 10
        var b = 20
        b = a.also { a = b }
        println(a)
        println(b)
    }
}