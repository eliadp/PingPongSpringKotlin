package com.eliadp.pinger

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PingerApplication

fun main(args: Array<String>) {
    runApplication<PingerApplication>(*args)
}
