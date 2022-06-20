package com.example.headfirstpractice

import Vehicle
import com.example.headfirstpractice.Animal.*

fun main(args: Array<String>) {

    val animal= Hippo()
    println(animal.image1)
    val vehicle=Vehicle()
    vehicle.lowerTemperaturre()

    val wolf=Wolf()
    wolf.makeNoise() // calls wolf
    wolf.roam() // calls Canine
    wolf.sleep() // calls Animal

    val animal1:Animal=Wolf()  //Assign Supertype
    animal1.eat()  // calls wolf eat


    val animals= arrayOf(Hippo(),Wolf())
    for (item in animals) {
        item.roam()
        item.eat()
    }
    val vet=Vet()
    val wolf1=Wolf()
    val hippo=Hippo()
    vet.giveShot(wolf1);
    vet.giveShot(hippo)



}