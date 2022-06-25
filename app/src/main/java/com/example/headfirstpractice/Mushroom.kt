package com.example.headfirstpractice

class Mushroom(val size: Int, val isMagic: Boolean) {

    constructor(isMagic_param: Boolean) : this(0, isMagic_param) {

    }

    fun findRecipes(
        title: String = "",
        ingredient: String = "",
        isvegeterain: Boolean = false,
        difficulty: String = ""
    ) :Array<Receipe>{
        return arrayOf(Receipe(title,isvegeterain))

    }
}