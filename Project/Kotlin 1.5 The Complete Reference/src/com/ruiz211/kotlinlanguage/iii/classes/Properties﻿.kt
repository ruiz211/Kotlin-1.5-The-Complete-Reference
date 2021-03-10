package com.ruiz211.kotlinlanguage.iii.classes

fun main(args: Array<String>) {
    val info = PersonInfo()
    info.description = "lateinit property"
    println(info.description)
}

class PersonInfo {
    enum class Cities {
        LONDON,
        PARIS,
        BERLIN,
        MOSCOW
    }

    var fullname: String = "Sherlock Holmes"
    var direction: String = "221-B Baker"
    val city: Cities = Cities.LONDON
    lateinit var description: String
}