package com.silva.learn_kotlin.basic

import java.time.LocalDateTime

enum class KotlinEnum {
    SOME, OTHER
}

enum class Color(var rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}

enum class ProtocolState {
    WAITING {
        override fun signal() = TALKING
    },
    TALKING {
        override fun signal() = WAITING
    };

    abstract fun signal(): ProtocolState
}

interface CustomOperator {
    fun apply(t: Int)
}

enum class ImplementsInterface : CustomOperator {
    PLUS {
        override fun apply(t: Int) = print("++")
    },
    TIMES {
        override fun apply(t: Int) = println(LocalDateTime.now())
    }
}