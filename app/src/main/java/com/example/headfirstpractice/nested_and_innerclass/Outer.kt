package com.example.headfirstpractice.nested_and_innerclass

class Outer {
    val x = "This is the outer class"

    inner class Nested {
        val y = "This is in the Nested class"
        fun myFun() = "This is the nested function"
        fun getX()="The value of x is $x"
    }


}