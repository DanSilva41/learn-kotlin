package com.silva.learn_kotlin.functions

import com.silva.learn_kotlin.classes.Product
import org.junit.jupiter.api.Test
import java.math.BigDecimal

internal class DeclarationTest {

    @Test
    fun shouldDestructureDeclaration() {
        val product = Product(1, "TV")
        val (i, a, t) = product
        println("ID: $i, Name: $a, Price: $t")
    }

    @Test
    fun shouldDestructureDeclarationByCall() {
        val product = Product(1, "TV")
        val id = product.component1()
        val name = product.component2()
        val price = product.component3()
        println("ID: $id, Name: $name, Price: $price")
    }

    @Test
    fun shouldValidateReturnTwoValuesByFunction() {
        val (id, name, price) = getProduct()
        println("ID: $id, Name: $name, Price: $price")
    }

    @Test
    fun shouldValidateReturnTwoValuesByFunctionWithUnusedVariables() {
        val (_, name, price) = getProduct()
        println("Name: $name, Price: $price")
    }

    private fun getProduct(): Product {
        return Product(1, "TV", BigDecimal.TEN)
    }
}