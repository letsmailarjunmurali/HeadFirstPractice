package com.example.headfirstpractice

class Wolf {

    var hunger = 10
    val food = "meat"

    //var w:Wolf?=Wolf()

    fun eat() {
        println("The Wolf is eating $food")
    }


    fun getAlphaWolf():Wolf?{
        return Wolf()
    }

}