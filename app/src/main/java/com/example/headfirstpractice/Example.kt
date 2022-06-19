package com.example.headfirstpractice

fun main(args: Array<String>) {


    val myDog = Dog("Fido", 70, "Mixed")
    myDog.bark()
    myDog.name="Lego"
    myDog.weight = 75
    println("The dog changed to ${myDog.name}")
    println("Weight in Kgs is ${myDog.weightInKgs}")
    myDog.weight=-2
    println("Weight is ${myDog.weight}")
    myDog.activities= arrayOf("Walks","Fetching balls","Frisbee")
    for (item in myDog.activities){
        println("My dog enjoys $item")
    }

    // Song Object

    var song1=Song("Patthala pathala","Kamal",true)
    var song2=Song("Robo da","Robot",false)

    song1.play()
    song1.stop()
    song2.play()

    //Rectangle

    var rectangle = arrayOf(Rectangle(1, 1), Rectangle(1, 1), Rectangle(1, 1), Rectangle(1, 1))

    for (x in 0..3){
        rectangle[x].width=(x+1)*3
        rectangle[x].height=x+5
        println("Rectangle $x has area ${rectangle[x].area}")
        println("It is ${if (rectangle[x].isSquare) "Square" else "Not a Square"}")
    }


}