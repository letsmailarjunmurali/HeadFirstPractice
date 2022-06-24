package com.example.headfirstpractice

fun main(args: Array<String>) {

    val animals = arrayOf(Hippo(), Wolf())
    for (item in animals) {
        item.roam()
        item.eat()
    }

    val vet = Vet()
    val wolf = Wolf()
    val hippo = Hippo()
    vet.giveShot(wolf)
    vet.giveShot(hippo)

    val roamable = arrayOf(Hippo(), Wolf(), Vehicle())
    for (item in roamable) {
        item.roam()
        if (item is Wolf)
            item.eat()
    }

    // is operator
    val animal = Wolf()
    val str = if (animal is Wolf) "Wolf" else "not Wolf"
    if (animal is Wolf && animal.hunger < 5) {

    }

    if (animal !is Wolf && animal.hunger < 5) {

    }

    val x = 3
    when (x) {
        0 -> println("X is zero")
        1, 2 -> println("X is 1 or 2")
    }

    val roamabl: Roamable = Hippo()
    when (roamabl) {
        is Wolf -> {

        }
        is Hippo -> {

        }

    }

    // when as an expression
    val isAccount = 0
    val result = when (isAccount) {
        isAccount -> true
        else -> false
    }

    val r:Roamable=Wolf()
//   var r:Roamable=Wolf()

    fun  myFunction(){
        if(r is Wolf){
            r.eat()
        }
    }


    var wolf1=r as Wolf // Roamable to Wolf
    wolf1.eat()

    if(r is Wolf){
        val wolf=r as Wolf
        wolf.eat()
    }

}