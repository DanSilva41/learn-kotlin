package com.silva.learn_kotlin.basic

class Range {

    fun verifyRange(base: Int, max: Int): Boolean {
        return base in 1..max
    }

    fun verifyOutRange(base: Int, max: Int): Boolean {
        return base !in 1..max
    }

    fun iterateRange(max: Int) {
        for (x in 1..max) print("$x\t")
    }

    fun iterateRangeProgression(max: Int) {
        for (x in 1..max step 2) print("$x\t")
    }

    fun iterateRangeProgressionDownTo(max: Int) {
        for (x in max downTo 8 step 2) print("$x\t")
    }
}