package com.example.headfirstpractice

fun main(args: Array<String>) {
    val groceries = listOf(
        Grocery("Tomatoes", "Vegetable", "1b", 3.0, 3),
        Grocery("Mushroom", "Vegetable", "1b", 4.0, 1),
        Grocery("Bangels", "Bakery", "Pack", 1.5, 2),
        Grocery("Olive oil", "Pantry", "Bottle", 6.0, 1),
        Grocery("Ice cream", "Frozen", "Pack", 3.0, 2)
    )

    val highestUnitPrice = groceries.maxByOrNull { it.unitPrice }
    println("Highest unit price $highestUnitPrice")

    val lowestQuantity = groceries.maxByOrNull { it.quantity }
    println("HlowestQuantity $lowestQuantity")

    val sumQuantity = groceries.sumBy { it.quantity }
    println("sumQuantity $sumQuantity")

    val totalPrice = groceries.sumByDouble { it.quantity * it.unitPrice }
    println("totalPrice $totalPrice")

    val vegetables = groceries.filter { it.category == "Vegetable" }
    println("vegetables $vegetables")

    val unitPriceOver3 = groceries.filter { it.unitPrice > 3.0 }
    println("unitPriceOver3 $unitPriceOver3")


    // map function
    val ints = listOf(1, 2, 3, 4)
    val doubleInts = ints.map { it * 2 }  // creates a new List


    val newPrice = groceries.filter { it.unitPrice > 3.0 }
        .map { it.unitPrice * 2 }


    //ForLoop -For Each
    for (item in groceries) {
        println(item.name)
    }


    // Equaivalent Foreach
    groceries.forEach { println(it.name) }


    for (item in groceries) {
        if (item.unitPrice > 3.0) println(item.name)
    }

    // chain together
    groceries.filter { it.unitPrice > 3.0 }.forEach { println(it.name) }


    var itemNames = ""
    groceries.forEach { itemNames += "${it.name} " }
    println("Itemnames" + itemNames)

}