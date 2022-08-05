package com.example.headfirstpractice.objectdeclaration.expression

import android.view.Window

fun main(args: Array<String>) {
    val startingPoint=object {
        val x = 2
        val y = 5
    }

    println("startingPoint ${startingPoint.x} ${startingPoint.y}}")

}