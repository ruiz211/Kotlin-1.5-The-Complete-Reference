package com.ruiz211.kotlinlanguage.iii.classes

fun main(args: Array<String>) {
    val person = Person("Charles", "Xavier")
    val second = Person(person.name, person.surname, 11)

    person.name = "John".also(::println)
    person.surname = "Chaplin".also(::println)

    println(person.toString())
    println(second.toString())

}

class Person(var name: String, var surname: String) {
    constructor(name: String, surname: String, number: Int) : this(name, surname) {
        this.name = name
        this.surname = surname
    }

    override fun toString(): String {
        return "Person(name='$name', surname='$surname')"
    }
}