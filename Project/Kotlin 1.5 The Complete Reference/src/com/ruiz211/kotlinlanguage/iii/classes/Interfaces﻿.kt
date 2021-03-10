package com.ruiz211.kotlinlanguage.iii.classes

fun main(args: Array<String>) {
    val fido: MyDog = MyDog(dogsNumber = 2)
    fido.walk()
    fido.walk(steps = 11)
    println(fido.dogsNumber)


//    val first = First()
//    first.callSecond()
}

class MyDog(override val dogsNumber: Int) : Dog {
    override fun walk() {
        println("Dog is walking")
    }

    override fun walk(steps: Int) {
        println("The dog has advanced $steps steps")
    }
}

interface Dog {
    val dogsNumber: Int

    fun walk()

    fun walk(steps: Int)
}

//interface Delegate {
//    fun call()
//}
//
//class First : Delegate {
//    init {
//        println("First class")
//    }
//
//    fun callSecond() {
//        val second = Second()
//        second.callFirst()
//    }
//
//    override fun call() {
//        println("Back to first")
//    }
//}
//
//class Second {
//    var delegate: Delegate
//
//    init {
//        println("Second class")
//    }
//
//    fun callFirst() {
//        val first = First()
//        sleep(2000)
//        delegate.call()
//    }
//}