package com.example.headfirstpractice.retailer

interface Retailer<out T> {
    fun sell():T
}