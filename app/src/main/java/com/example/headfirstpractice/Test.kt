package com.example.headfirstpractice

fun main(args: Array<String>) {

    print("Hello")

    var small_num:Short
    small_num=1
    println(small_num)

    var x:Int
//  var y=x+6 // must initaialize

    // Assigning a value to another variable
    var a=4
    var b=a
    var z:Long=a.toLong()

    //Arrays
    val wordArray1 = arrayOf("24/7", "multi-tier", "B-to-B", "dynamic", "pervasive")
    val wordArray2 = arrayOf("empowered", "leverged", "aligned", "targeted")
    val wordArray3 = arrayOf("process", "paradigm", "solution", "portal", "vision")

    println("First item in the array ${wordArray1[0]}")

    val rand1 = (Math.random() * wordArray1.size).toInt()
    var rand2 = (Math.random() * wordArray2.size).toInt()
    val rand3 = (Math.random() * wordArray3.size).toInt()

    val phrase="${wordArray1[rand1]} ${wordArray2[rand2]} ${wordArray3[rand3]} ${wordArray1.size}"
    println(phrase)

    // complex expressions
    val string1 = "My array is ${if (wordArray1.size < 3) "small" else "big"}"
    println(string1)

    var myArray = arrayOf(1, 2, 3)
    myArray[1]=5;
  //  myArray[1]="arjun" wont compile

    //Explicity define arrary type
    var myArray1: Array<Byte> = arrayOf(1, 2, 3)

    myArray1= arrayOf(4,5,6)

    val myArray2 = arrayOf(7, 8, 9)
    //myArray2= arrayOf(3,5)
    myArray2[0] = 0



}