package com.example.headfirstpractice.funmore

fun main(args: Array<String>) {

    val list= arrayOf("1","2","3","4")
    valuesToList("0",*list,"5","6")

}


fun <T> valuesToList(vararg vals:T):MutableList<T>{

    val list= mutableListOf<T>()
    for (i in vals) {
        list.add(i)
    }
    return list;
}