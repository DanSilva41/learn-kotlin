package com.silva.learn_kotlin.functions

import com.silva.learn_kotlin.classes.Product
import org.junit.jupiter.api.Test
import java.math.BigDecimal

internal class LambdasTest {

    @Test
    fun shouldShowFoldFunction() {
        val items = listOf(1, 2, 3, 4, 5)

        items.fold(0, { acc, i ->
            print("acc = $acc, i = $i")
            val result = acc + i
            println("result = $result")
            result
        })

        println(items.fold(1, Int::times))
    }

    @Test
    fun shouldTestFunctionTypeInstance() {
        val a = { i: Int -> i + 1 }
        println(a(3))

        val stringPlus: (String, String) -> String = String::plus
        val intPlus: Int.(Int) -> Int = Int::plus

        println(stringPlus.invoke("<-", "->"))
        println(stringPlus("Hello, ", "world!"))

        println(intPlus.invoke(1, 2))
        println(intPlus(1, 1))
        println(2.intPlus(3)) // extension

        val product = Product(id = 1, price = BigDecimal.TEN, name = "Sofa", any = 5)
        product.getAny()

    }
}