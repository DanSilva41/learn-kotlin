package com.silva.learn_kotlin.functions

import com.silva.learn_kotlin.classes.Customer
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class ArgsFunctionsTest {

    @Test
    fun shouldShowVararg() {
        val one = Customer("one")
        val two = Customer("two")
        val three = Customer("three")
        assertEquals(3, asList(one, two, three).size)

    }

    @Test
    fun shouldTestInfix() {
        val returned = 4 custom 1
        println(returned)
    }

    fun asList(vararg customers: Customer): List<Customer> {
        val result = ArrayList<Customer>()
        for (t in customers)
            result.add(t)
        return result
    }

    infix fun Int.custom(x: Int): Int {
        return this + x
    }
}