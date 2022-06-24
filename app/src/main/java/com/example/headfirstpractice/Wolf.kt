package com.example.headfirstpractice

class Wolf : Canine() {
    override val image: String
        get() = "Wolf.jpg"
    override val food: String
        get() = "Meat"
    override val habitat: String
        get() = "Forests"

    override fun makeNoise() {
        println("Hoooooooooow")
    }

    override fun eat() {
        println("The Wolf is eating $food")
    }
}