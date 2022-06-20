package com.example.headfirstpractice.Animal

open class Animal {

    open val image = ""
    open var image1 = ""
    open val food = ""
    open val habitat = ""
    var hunger = 10

    open fun makeNoise() {
        println("Animal is making the noise")
    }

    open fun eat() {
        println("Animal is eating")
    }

    open fun roam() {
        println("Animal is roaming")

    }

    fun sleep() {
        println("Animal is Sleeping")

    }

}