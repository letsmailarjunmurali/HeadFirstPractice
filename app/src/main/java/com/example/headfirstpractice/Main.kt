package com.example.headfirstpractice

import com.example.headfirstpractice.contest.Contest
import com.example.headfirstpractice.pet.Cat
import com.example.headfirstpractice.pet.Dog
import com.example.headfirstpractice.pet.Fish
import com.example.headfirstpractice.pet.Pet
import com.example.headfirstpractice.retailer.CatRetailer
import com.example.headfirstpractice.retailer.DogRetailer
import com.example.headfirstpractice.retailer.Retailer
import com.example.headfirstpractice.vet.Vet

fun main(args: Array<String>) {


    val catVet=Vet<Cat>()
    val fishVet=Vet<Fish>()
    val petVet=Vet<Pet>()

    val catContest=Contest<Cat>(catVet)
    catContest.addScore(Cat("Katsu"),50)
    catContest.addScore(Cat("Fido"),80)
//    catContest.getWinners().first()

    val petcontest=Contest<Pet>(petVet)
    petcontest.addScore(Cat("Fuzz"))
    petcontest.addScore(Fish("Shark"))
   // catContest.getWinners().first()


    val dogRetailer: Retailer<Dog> = DogRetailer()
    val catRetailer: Retailer<Cat> = CatRetailer()
    val petRetailer: Retailer<Cat> = CatRetailer()
    petRetailer.sell()

    catVet.treat(Cat("Fuzz"))
    petVet.treat(Cat("Fuzz"))
//    catVet.treat(Fish("Finny")) //wont compile

    val catContest1=Contest<Cat>(catVet)
    val petContest2=Contest<Pet>(petVet)

    val catContest3=Contest<Cat>(petVet)






}