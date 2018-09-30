package com.eliadp.ponger

import com.github.kittinunf.fuel.Fuel
import org.springframework.web.bind.annotation.*

/**
 * The controller of the Ponger entity.
 */
@RestController
class PongerController {
    @RequestMapping("/pong")
    fun ping(): String {
        Fuel.get("http://localhost:8080/ping").response()
        println("Ping received...")
        return "Ping received..."
    }
}