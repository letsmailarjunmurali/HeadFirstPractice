package com.example.headfirstpractice.multipletest

class C:A,B {


    override fun myfunc() {
        super<A>.myfunc()
        super<B>.myfunc()

    }

}