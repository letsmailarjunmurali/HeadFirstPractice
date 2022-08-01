package com.example.headfirstpractice.retailer

import com.example.headfirstpractice.pet.Cat
import com.example.headfirstpractice.pet.Dog
import com.example.headfirstpractice.pet.Pet

fun main(args: Array<String>) {
    val dogRetailer:Retailer<Dog> =DogRetailer()
    val catRetailer:Retailer<Cat> =CatRetailer()

    //val petRetailer:Retailer<Pet> =CatRetailer() //wont copile and violates polymorphism






}