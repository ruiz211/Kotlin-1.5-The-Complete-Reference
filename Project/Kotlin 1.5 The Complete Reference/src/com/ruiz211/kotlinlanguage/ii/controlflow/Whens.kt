package com.ruiz211.kotlinlanguage.ii.controlflow

fun main(args: Array<String>) {
    println(option(7))
}

fun option(x: Int): String {
    return when (x) {
        1, 2 -> "1 or 2"
        in 3..10 -> "between 3 and 10"
        else -> "other value"
    }
}