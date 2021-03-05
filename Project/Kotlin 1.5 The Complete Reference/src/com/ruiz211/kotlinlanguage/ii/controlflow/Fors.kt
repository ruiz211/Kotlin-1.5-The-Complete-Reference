package com.ruiz211.kotlinlanguage.ii.controlflow

fun main(args: Array<String>) {
    foo()
}

fun foo() {
    listOf(1, 2, 3, 4, 5).forEach {
        if (it == 3) return // non-local return directly to the caller of foo()
        print(it)
    }
    println("this point is unreachable")
}