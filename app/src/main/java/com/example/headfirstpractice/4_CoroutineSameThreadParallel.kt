package com.example.headfirstpractice.co2

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

suspend fun playBeats(beats: String, file: String) {
    val parts = beats.split("x")
    var count = 0
    for (part in parts) {
        count += part.length + 1
        if (part == "") {
            playSound(file)
        } else {
            delay(100 * (part.length + 1L))
            if (count < beats.length) {
                playSound(file)
            }
        }
    }

}

fun playSound(file: String) {

    println("playing sound")
}

fun main(args: Array<String>) {
    runBlocking {
        launch {
            playBeats("x-x-x-x-x-x", "toms.aiff")

        }
        playBeats("x---x---", "crash_cymbal.aiff")

    }
}