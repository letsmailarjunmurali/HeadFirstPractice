package com.example.headfirstpractice.nested_and_innerclass

fun main(args: Array<String>) {

    val nested = Outer().Nested()
    println(nested.y)
    println(nested.myFun())
    println(nested.getX())

}