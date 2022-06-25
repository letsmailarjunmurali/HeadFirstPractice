package com.example.headfirstpractice

data class Receipe1(
    val title: String,
    val mainIngredient: String,
    val isVegetarian: Boolean=false,
    val difficulty: String="Easy"
) {
}