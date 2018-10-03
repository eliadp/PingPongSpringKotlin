package com.eliadp.pinger

import com.github.kittinunf.fuel.Fuel
import org.springframework.web.bind.annotation.*

/**
 * The controller of the Pinger entity.
 */
@RestController
class PingerController {

    var pongerRoute: String = ""
    fun setPongerRoute(value: String): PingerController {
        pongerRoute = value
        return this
    }

    @PostMapping("/table")
    fun pong(): String {
        Fuel.post(pongerRoute).response()
        println("Pong received...")
        return "Pong received..."
    }
}