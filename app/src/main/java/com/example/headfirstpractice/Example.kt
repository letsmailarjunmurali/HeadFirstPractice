package com.example.headfirstpractice


fun main(args: Array<String>) {
    foo(6)
    doSomething()
}

fun foo(param: Int) {
    println("Parameter is $param")
}

fun printSum(a: Int, b: Int): Int {
    return a + b
}

fun printSum1(a: Int, b: Int): Unit {
    println(a + b)
}

fun max(a: Int, b: Int): Int {
    val maxvalue = if (a > b) a else b
    return maxvalue
}

// fun with single expression

fun max1(a: Int, b: Int) = if (a > b) a else b

fun myfunction(message: String) {
    val msg: String
    //message="hi"
    // return msg
}


fun timesThree(x: Int): Int {
    val y = x * 3
    return y
}


fun doSomething() {
    for (x in 1..10) {
        println(x)
    }
    for (x in 1 until 10) {
        println(x)
    }

    for (x in 15 downTo 1) {

    }
    println("step")
    for (x in 1..50 step 2) {
        println(x)
    }

}


// looping through items in array
fun dosomethingloop() {
    val array: Array<Int> = arrayOf(2, 3, 4)
    for (item in array) {
        println("Item is " + item)
    }


    for ((index, item) in array.withIndex()) {
        println("the item is $item in the index $index ")
    }
}
