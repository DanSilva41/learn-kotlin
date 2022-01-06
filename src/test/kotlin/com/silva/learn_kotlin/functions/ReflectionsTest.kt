package com.silva.learn_kotlin.functions

import com.silva.learn_kotlin.classes.Product
import org.junit.jupiter.api.Test
import java.math.BigDecimal

internal class ReflectionsTest {

    @Test
    fun shouldShowReflectionInClass() {
        val oneProduct = Product(1, "Blusa", BigDecimal.TEN)
        val propName = Product::name
        println(propName.get(oneProduct))
    }
}