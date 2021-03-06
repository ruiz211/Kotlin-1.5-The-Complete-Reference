package com.ruiz211.kotlinlanguage.i.basics

//Numbers

val one: Int = 1
val threeBillion: Long = 3000000000L
val oneByte: Byte = Byte.MIN_VALUE
var oneDouble: Double = one.toDouble()
var oneFloat: Float = Float.MAX_VALUE


//Booleans
val oneBoolean: Boolean = false


//Strings
var string: String = one.toString()


//Arrays
var names: Array<String> = arrayOf("Monica", "Charles", "Camila", "John", "Peter")


fun main(args: Array<String>) {
    println(oneFloat)
    println(string.plus("..."))

    names.sortedArray().forEach { s: String -> println(s) }
}