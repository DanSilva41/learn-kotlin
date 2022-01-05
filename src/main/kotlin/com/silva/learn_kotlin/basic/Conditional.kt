package com.silva.learn_kotlin.basic

class Conditional {

    fun normalMaxOf(a: Int, b: Int): Int {
        if (a > b) {
            return a
        } else {
            return b
        }
    }

    fun liftReturnMaxOf(a: Int, b: Int): Int {
        return if (a > b) {
            a
        } else {
            b
        }
    }

    fun expressionMaxOf(a: Int, b: Int) = if (a > b) a else b
}