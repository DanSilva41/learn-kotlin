package com.silva.learn_kotlin.basic

class ForLoop {

    fun iterateInItems() {
        val items = listOf("apples", "banana", "papaya")
        for (i in items) println(i)
    }

    fun iterateInIndices() {
        val items = listOf("apples", "banana", "papaya")
        for (index in items.indices) println(index)
    }
}