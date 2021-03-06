package com.ruiz211.kotlinlanguage.iii.classes

fun main(args: Array<String>) {
    val son = Son("George")
    son.printInfo()
}

open class Father(surname: String) {
    open val counter: Int = 11

    open fun printInfo() {
        println("Father info")
    }
}

class Son(name: String) : Father(name) {
    override var counter: Int = 37

    override fun printInfo() {
//        super.printInfo()
        println("Son info")
    }
}

