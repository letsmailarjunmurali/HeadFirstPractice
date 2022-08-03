package com.example.headfirstpractice.co

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

fun playBeats(beats: String, file: String) {
    val parts = beats.split("x")
    var count = 0
    for (part in parts) {
        count += part.length + 1
        if (part == "") {
            playSound(file)
        } else {
            Thread.sleep(100 * (part.length + 1L))
            if (count < beats.length) {
                playSound(file)
            }
        }
    }

}

fun playSound(file: String) {


}

fun main(args: Array<String>) {

    //It plays the song in parallel
    GlobalScope.launch {
        playBeats("x-x-x-x-x-x", "toms.aiff")
    }
    playBeats("x---x---", "crash_cymbal.aiff")


}