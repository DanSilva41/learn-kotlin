package com.silva.learn_kotlin.idioms

import org.junit.jupiter.api.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

internal class PojoTest {

    @Test
    fun validatePojo() {
        val onePojo = Pojo("user", "user@email.com")
        val samePojo = onePojo.copy()
        val otherPojo = onePojo.copy("user1")
        assertTrue { onePojo.equals(samePojo) }
        assertFalse { onePojo.equals(otherPojo) }

        println(onePojo)
        println(samePojo)
        println(otherPojo)

        val (name, anyNameOfString) = onePojo
        println("$name, $anyNameOfString")
    }
}