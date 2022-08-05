package com.example.headfirstpractice.sealedclassex

import java.lang.Exception


fun main(args: Array<String>) {

    val messageSucccess=MessageSuccess("Yay")

    val messageSucccess1=MessageSuccess("It Worked")

    val messageFailure=MessageFailure("Boo!", Exception("Gone Wrong"))


    var myMessageType:MessageType=messageFailure

    val myMessage=when(myMessageType){
        is MessageSuccess->myMessageType.msg
        is MessageFailure->myMessageType.msg+" "+myMessageType.e.message
    }

    println(myMessage)

}