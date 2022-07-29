package com.example.headfirstpractice

class MyWolf {
    var wolf: Wolf? = Wolf()
    fun myFunction() {
        wolf?.eat()
    }
}