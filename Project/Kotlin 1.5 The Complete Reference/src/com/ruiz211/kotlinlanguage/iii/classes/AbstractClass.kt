package com.ruiz211.kotlinlanguage.iii.classes

fun main(args: Array<String>) {
    var figure = Figure()
    figure.draw()
    figure = Rectangle()
    figure.draw()
}

open class Figure {
    open fun draw() {
        println("Drawing figure")
    }
}

class Rectangle : Figure() {
    override fun draw() {
        println("Drawing rectangle")
    }
}

