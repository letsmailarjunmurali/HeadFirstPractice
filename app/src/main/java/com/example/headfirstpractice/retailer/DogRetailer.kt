package com.example.headfirstpractice.retailer

import com.example.headfirstpractice.pet.Dog

class DogRetailer:Retailer<Dog>{

    override fun sell(): Dog {
        return Dog("Sell Dog")
    }
}