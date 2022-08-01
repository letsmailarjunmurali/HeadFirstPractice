package com.example.headfirstpractice.retailer

import com.example.headfirstpractice.pet.Cat

class CatRetailer :Retailer<Cat> {
    override fun sell(): Cat {
        return Cat("Sell Cat")
    }
}