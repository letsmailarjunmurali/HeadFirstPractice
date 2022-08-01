package com.example.headfirstpractice.retailer

import com.example.headfirstpractice.pet.Fish

class FishRetailer:Retailer<Fish> {
    override fun sell(): Fish {
        return Fish("Sell Fish");
    }
}