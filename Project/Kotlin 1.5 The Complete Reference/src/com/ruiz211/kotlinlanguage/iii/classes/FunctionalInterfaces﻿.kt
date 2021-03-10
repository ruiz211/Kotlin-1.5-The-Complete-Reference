package com.ruiz211.kotlinlanguage.iii.classes

fun main(args: Array<String>) {
    val facto: Factorial = Factorial { it * 12 }
    println(facto.facto(12))
}

fun interface Factorial {
    fun facto(number: Int): Int
}