package com.example.headfirstpractice.Animal

class Hippo:Animal() {
    override val image: String="Hippo.jpg"
    override val food: String="Grass"
    override val habitat: String="Water"

    override fun makeNoise() {
        println("Grunt Grunt")
    }

    override fun eat() {
        println("Hippo is eating $food")
    }

}