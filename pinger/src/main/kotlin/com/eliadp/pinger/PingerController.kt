package com.eliadp.pinger

import com.github.kittinunf.fuel.Fuel
import org.springframework.web.bind.annotation.*

/**
 * The controller of the Pinger entity.
 */
@RestController
class PingerController {

    @RequestMapping("/ping")
    fun ping(): String {
        Fuel.get("http://localhost:8081/pong").response()
        println("Pong received...")
        return "Pong received..."
    }
}