package com.silva.learn_kotlin.classes

import java.math.BigDecimal

data class Product(val id: Int, var name: String?, var price: BigDecimal = BigDecimal.ZERO, private var any: Int) : Comparable<Product> {

    fun getAny() = any

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Product
        return this.id == other.id
    }

    override fun hashCode() = this.id.hashCode()

    override fun compareTo(other: Product) = this.id.compareTo(other.id)

    fun changeableName(): Boolean? {
        return if (this.name == null) null
                else this.name!!.isBlank()
    }
}