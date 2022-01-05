package com.silva.learn_kotlin.classes

import java.math.BigDecimal

class Product(val id: Int, var name: String, var price: BigDecimal = BigDecimal.ZERO) : Comparable<Product> {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Product
        return this.id == other.id
    }

    override fun hashCode(): Int {
        return this.id.hashCode()
    }

    override fun compareTo(other: Product): Int {
        return this.id.compareTo(other.id)
    }
}