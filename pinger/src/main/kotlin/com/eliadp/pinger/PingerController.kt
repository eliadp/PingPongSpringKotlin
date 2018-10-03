package com.eliadp.pinger

import com.eliadp.core.Message
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
    fun pong(@RequestBody message : Message): String {
        val request = Fuel.post(pongerRoute).body("{ \"value\" : \"Ping\" }")
        request.headers["Content-Type"] = "application/json"
        request.response()

        println("${message.value} received...")
        return "${message.value} received..."
    }
}