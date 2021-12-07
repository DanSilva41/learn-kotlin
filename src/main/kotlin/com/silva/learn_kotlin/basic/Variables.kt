package com.silva.learn_kotlin.basic

class Variables {

    fun defineVariables() {
        val a: Int = 1 // immediate assigment
        val b = 2 // `Int` type is inferred
        val c: Int  // Type required when no initializer is provided
        c = 3
        // c = 4   val is final variable

        var x = 5 // `Int` type is inferred
        x += 1
    }

    val PI = 3.14
    var x = 0

    fun incrementX() {
        x += 1
    }

    fun run() {
        println("x = $x; PI = $PI")
        incrementX()
        println("incrementX()")
        println("x = $x; PI = $PI")
    }
}