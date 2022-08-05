package com.example.headfirstpractice.extensions

class ExtesnsionProprty {

    val String.halflength
        get() = length / 2


    fun test(){
        val test="This is the sentence"
        println(test.halflength)
    }


}