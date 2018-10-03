package com.eliadp.ponger

import com.eliadp.core.Message
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
    fun ping(@RequestBody message : Message): String {
        val request = Fuel.post(pingerRoute).body("{ \"value\" : \"Pong\" }")
        request.headers["Content-Type"] = "application/json"
        request.response()

        println("${message.value} received...")
        return "${message.value} received..."
    }
}