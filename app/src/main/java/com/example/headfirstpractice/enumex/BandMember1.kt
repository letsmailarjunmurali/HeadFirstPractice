package com.example.headfirstpractice.enumex

enum class BandMember1(val instrument: String) {
    JERRY("lead ") {
        override fun sings(): String {
            return "plaintively"
        }
    },
    BOBBY("rhythm guitar") {
        override fun sings(): String {
            return "horsely"
        }
    },
    PHIL("bass");

    open var name1="sdf"
    open fun sings() = "occanally"

}