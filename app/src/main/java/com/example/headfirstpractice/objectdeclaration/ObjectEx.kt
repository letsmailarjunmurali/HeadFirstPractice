package com.example.headfirstpractice.objectdeclaration

fun main(args: Array<String>) {
    DuckManager.allDucks

    val duck=Duck.DuckFactory.create()

    val duckcompanion=com.example.headfirstpractice.objectdeclaration.companion.Duck.create()
}