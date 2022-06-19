package com.example.headfirstpractice

class Song(val song:String,val artist:String,val isindia:Boolean) {

    fun play(){
        if(isindia)
        println("${song} is playing ")
    }

    fun stop(){
        println("${song} is stoped ")
    }

}