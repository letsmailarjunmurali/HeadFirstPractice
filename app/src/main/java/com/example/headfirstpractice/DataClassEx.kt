package com.example.headfirstpractice


fun main(args: Array<String>) {

    val r1=Receipe("Chicken Bhuna",false)
    val r2=Receipe("Chicken Bhuna",false)

    println(r1.equals(r2))
    println(r1.hashCode())
    println(r2.hashCode())
    println(r1.toString())


    val objectCopy=r1.copy(isVegetarian = true)
    println(objectCopy)

    val (title,veg)=r1
    println("The destructure object $title $veg")

    //passing values in order
    val v3=Receipe1("Spaghetti Bolognese","Beef")
    val v4=Receipe1("Spaghetti Bolognese","Beef",true)


    // named arguments
    val v5=Receipe1(mainIngredient = "Mutton",title = "Keema")

}