package com.example.headfirstpractice.Animal

class Wolf : Canine() {
    override val image: String = "Wolf.jpg"
    override val food: String = "Meat"
    override val habitat: String = "Forests"

    override fun makeNoise() {
        println("Howwwww")
    }

    override fun eat() {
        println("The Wolf is eating $food")
    }

}