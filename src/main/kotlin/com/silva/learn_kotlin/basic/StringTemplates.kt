package com.silva.learn_kotlin.basic

class StringTemplates {

    fun run() {
        var a = 10
        val s1 = "a is $a"

        a = 2

        val s2 = "${s1.replace("is", "was")}, but now is $a"
        println("\n$s2")

    }
}