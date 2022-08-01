package com.example.headfirstpractice.vet

import com.example.headfirstpractice.pet.Pet

class Vet<T:Pet> {

    fun treat(t:T){
        println("Treat Pet ${t.name}")
    }
}