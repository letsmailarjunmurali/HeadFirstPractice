package com.example.headfirstpractice

fun main(args: Array<String>) {

    // statements
    var x=3
    val name="Arjun"
    x=x+3
    println("X is $x")

    //Do something again and again
    var i=0
    while (i<10){
        i++
        println("Index is $i")
    }

    //Do something under a condition (branching)
    if(x==20){
        println("x must be 20")
    }else{
        println("x is not 20")
    }


    var value=1
    println("Before the loop $value")
    while (value<4){
        println("In the loop $value")
        value++
    }
    println("After the loop $value")

    //if as expression
    val a=10
    val b=20
    val result = if (a < b) "A is less" else "B is less"
    println("Result is $result")

}