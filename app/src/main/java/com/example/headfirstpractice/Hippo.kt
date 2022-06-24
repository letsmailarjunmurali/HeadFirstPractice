package com.example.headfirstpractice

class Hippo:Animal() {
    override val image: String="Hippo.jpg"
    override val food: String="Grass"
    override val habitat: String="Water"

    override fun makeNoise() {
        println("Grunt! Grunt!")
    }

    override fun eat() {
        println("The Hippo is eating $food")
    }
}

