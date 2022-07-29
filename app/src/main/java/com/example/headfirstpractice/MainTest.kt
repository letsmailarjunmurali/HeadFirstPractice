package com.example.headfirstpractice

fun main(args: Array<String>) {

    var w: Wolf? = null
    if (w != null) {
        w.eat()
    }

    var x = w?.hunger
    println("The value of x is $x")

    var y = w?.hunger ?: -1
    println("The value of y is $y")

    var myWolf = MyWolf()
    myWolf?.wolf?.hunger = 0
    println("The value of myWolf?.wolf?.hunger=0 is ${myWolf?.wolf?.hunger}")

    var myArray = arrayOf("Hi", "Hello", null)
    for (item in myArray) {
        item?.let {
            println("The item is $it")
        }
    }

    w?.getAlphaWolf()?.let {
        it.eat()
    }

    var z = w!!.hunger
}


fun example() {
    var wolf: Wolf? = Wolf()    // nullable types
    //wolf = null

    if (wolf != null) {
        wolf.eat()
    }
    //or safe call operator
    wolf?.eat()

    // wolf?.w?.hunger  //if not null returns hunger if null return null

    wolf?.hunger = 1 // if null it wont do nothing

    var str: String? = "Pizza"
    str = null
    var str1: String? = null
    println(str1)

    // create an array of nullable types
    val myArray: Array<String?> = arrayOf("Hi", "Hello", null)

    var x: String? = null

    var w: Wolf = Wolf()
    if (w != null) {
        println(w.hunger)
    }

    w?.let {
        println(it.hunger)
    }


    // using let with array items
    var array = arrayOf("Hi", "Hello", null)
    for (item in array) {
        item?.let {
            println("The item in array is $it")
        }
    }
}

fun printInt(x: Int?) {
    println("The value is $x")
}

fun result(): Long? {
    return null
}