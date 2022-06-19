package com.example.headfirstpractice

class Dog(var name: String, weight_param: Int, breed_param: String) {


    init {
        println("Dog $name has been created")
    }

    var activities = arrayOf("Walks")

    val breed = breed_param.toUpperCase()

    init {
        println("The beed is $breed_param")
    }

    var weight = weight_param
        set(value) {
            if (value > 0) field = value
        }

    val weightInKgs:Double
        get() = weight/2.2

    fun bark(){
        println(if (weight <= 20) "Yip!" else "Woof!")
    }


}


