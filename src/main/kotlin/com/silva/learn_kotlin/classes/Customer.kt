package com.silva.learn_kotlin.classes

class Customer /* @Inject */ constructor(name: String) {
    val customerKey = name.uppercase()
}

class Person(val name: String) {
    private val children: MutableList<Person> = mutableListOf()

    constructor(name: String, parent: Person) : this(name) {
        parent.children.add(this)
    }
}