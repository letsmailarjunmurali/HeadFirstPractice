package com.example.headfirstpractice.contest

import com.example.headfirstpractice.pet.Pet
import com.example.headfirstpractice.vet.Vet

class Contest<T:Pet> (var vet:Vet<in T>){

    val scores:MutableMap<T,Int> = mutableMapOf();

    fun addScore(t:T,score:Int=0){
        if(score>=0) scores.put(t,score)
    }

    fun getWinners():MutableSet<T>{
        val highscore=0

        val winners:MutableSet<T> = mutableSetOf()
        for ((t,score) in scores){
            if (score==highscore) winners.add(t)
        }

        return winners
    }

}