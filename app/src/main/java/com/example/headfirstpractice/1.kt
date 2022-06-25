package com.example.headfirstpractice

fun main(args: Array<String>) {

    val w1 = Wolf()
    val w2 = w1
    println(w1 == w2) // == calls equals true both refers same object

    val w3 = Wolf()    // Creates new Wolf object
    val w4 = Wolf()   // Creates new Wolf object
    println(w3 == w4)   // false


    println(w1.equals(w2)) // true
    println(w3.equals(w4)) // true
    println(w1.hashCode())
    println(w1.toString())





}