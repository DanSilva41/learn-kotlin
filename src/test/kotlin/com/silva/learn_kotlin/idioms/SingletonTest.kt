package com.silva.learn_kotlin.idioms

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class SingletonTest {

    @Test fun inicializeSingleton() {
        val singleton = Singleton
        assertEquals("Name", singleton.name)

//        singleton.name = "Other"  // Not Possible
    }
}