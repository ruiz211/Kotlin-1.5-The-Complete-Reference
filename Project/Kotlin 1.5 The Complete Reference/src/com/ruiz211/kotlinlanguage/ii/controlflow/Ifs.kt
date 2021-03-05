package com.ruiz211.kotlinlanguage.ii.controlflow

fun main(args: Array<String>) {
    print(min(17, 37))
}

fun min(a: Int, b: Int): Int {
    return if (a < b) a else b
}