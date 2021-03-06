package com.ruiz211.kotlinlanguage.iii.classes

fun main(args: Array<String>) {
    val person = Person("Charles", "Xavier")
    person.name = "John".also(::print)

}

class Person constructor(var name: String, val surname: String) {
    private var people: MutableList<Person> = mutableListOf()

    constructor(name: String, surname: String, parent: Person) : this(name, surname) {
        parent.people.add(this)
    }

}