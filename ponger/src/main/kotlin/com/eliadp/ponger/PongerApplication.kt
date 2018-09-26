package com.eliadp.ponger

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PongerApplication

fun main(args: Array<String>) {
    runApplication<PongerApplication>(*args)
}
