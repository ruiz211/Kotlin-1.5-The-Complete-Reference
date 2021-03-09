package com.ruiz211.kotlinlanguage.iii.classes

fun main(args: Array<String>) {
    val person = Person("Charles", "Xavier")
    val second = Person(person.name, person.surname, person)

    person.name = "John".also(::println)
    person.surname = "Chaplin".also(::println)

    println(person.toString())
    println(second.toString())

}

class Person constructor(var name: String, var surname: String) {
    private var people: MutableList<Person> = mutableListOf()

    constructor(name: String, surname: String, parent: Person) : this(name, surname) {
        parent.people.add(this)
    }

    override fun toString(): String {
        return "Person(name='$name', surname='$surname')"
    }
}