package com.ruiz211.kotlinlanguage.i.basics


var values: Array<Any> = arrayOf("String", 11, true, 101F)

fun main(args: Array<String>) {
    for (v in values) {
        if (v is String) println("String value")
        if (v is Int) println("Int value")
        if (v is Boolean) println("Boolean value")
        if (v is Float) println("Float value")
    }

    values.forEach { any: Any -> println(any) }
}

