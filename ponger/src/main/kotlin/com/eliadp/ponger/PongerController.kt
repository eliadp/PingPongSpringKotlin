package com.eliadp.ponger

import com.github.kittinunf.fuel.Fuel
import org.springframework.web.bind.annotation.*

/**
 * The controller of the Ponger entity.
 */
@RestController
class PongerController {

    var pingerRoute: String = ""
    fun setPingerRoute(value: String): PongerController {
        pingerRoute = value
        return this
    }

    @PostMapping("/table")
    fun ping(): String {
        Fuel.post(pingerRoute).response()
        println("Ping received...")
        return "Ping received..."
    }
}