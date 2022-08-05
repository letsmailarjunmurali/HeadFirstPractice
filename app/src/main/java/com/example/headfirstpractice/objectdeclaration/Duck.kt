package com.example.headfirstpractice.objectdeclaration


// declaring object in class.only one instance of object is shared by all instance of duck
class Duck {

    object DuckFactory {
        fun create() =Duck()
    }

}