package com.ruiz211.kotlinlanguage.iii.classes

fun main(args: Array<String>) {
    val son = Son(name = "George")
    son.printInfo()

    val father = Father(surname = "Washington")
    father.printInfo()
}

open class Father constructor(surname: String) {
    open val counter: Int = 11

    init {
        println("Father class")
    }

    open fun printInfo() {
        println("Father info")
    }
}

class Son constructor(name: String) : Father(name) {
    override var counter: Int = 37

    init {
        println("Son class")
    }

    override fun printInfo() {
        super.printInfo()
        println("Son info")
    }
}