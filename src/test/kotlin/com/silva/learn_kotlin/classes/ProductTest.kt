package com.silva.learn_kotlin.classes

import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import java.math.BigDecimal
import kotlin.test.assertEquals

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class ProductTest {

    lateinit var products: Set<Product>

    @BeforeAll
    fun setUp() {
        products = this.createProducts()
    }

    @Test
    fun shouldIterateInManyProducts() {
        for (p in products) {
            println("Product number ${products.indexOf(p)}, ${p.name} - ${p.price}")
        }

        val returned = when {
            Product(1, "") in products -> "Found"
            else -> "Error"
        }

        assertEquals("Found", returned)

        println()
        products.filter { it.price.compareTo(BigDecimal.ZERO) == 1 }
            .sortedBy { it }
            .forEach { println("Product number ${products.indexOf(it)}, ${it.name} - ${it.price}") }
    }

    private fun createProducts(): Set<Product> {
        val tv = Product(1, "LG - Smart TV", BigDecimal("2989.99"))
        val sofa = Product(2, "Sofa azul", BigDecimal("799.99"))
        return setOf(tv, sofa)
    }

}