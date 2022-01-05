package com.silva.learn_kotlin.basic

class WhileLoop {

    fun iterateInItems() {
        val items = listOf("apples", "banana", "papaya")
        var index = 0
        while(index < items.size) {
            println("item at $index is ${items[index]}")
            index++
        }
    }
}