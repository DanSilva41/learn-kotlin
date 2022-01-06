package com.silva.learn_kotlin.classes

import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import java.math.BigDecimal
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class ProductTest {

    lateinit var products: Set<Product>
    lateinit var mapProducts: MutableMap<Int, Product>

    @BeforeAll
    fun setUp() {
        products = this.createProducts()
        mapProducts = mutableMapOf()
        for (p in products) {
            mapProducts.put(p.id, p)
        }
    }

    @Test fun shouldIterateInManyProducts() {
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

    @Test fun validateNullName() {
        val returnedProduct = products.any { it.changeableName() == null }
        assertTrue { returnedProduct }
    }

    @Test fun checkType() {
        val name: Any = "Someone"
        assertTrue { name is String }
        assertFalse { name is Product }
    }

    @Test fun accessMapOfProdcuts() {
        println(mapProducts[2])
        mapProducts[2]!!.price = BigDecimal("899.99")
        println(mapProducts[2])

        for((k, v) in mapProducts) println("$k -> $v")
    }

    private fun createProducts(): Set<Product> {
        val tv = Product(1, "LG - Smart TV", BigDecimal("2989.99"))
        val sofa = Product(2, "Blue sofa", BigDecimal("799.99"))
        val bed = Product(3, null, BigDecimal("1299.99"))
        return setOf(tv, sofa, bed)
    }

}