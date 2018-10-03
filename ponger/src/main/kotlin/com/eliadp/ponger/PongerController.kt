package com.eliadp.ponger

import com.github.kittinunf.fuel.Fuel
import com.google.gson.Gson
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
    fun ping(@RequestBody message : String): String {
        Fuel.post(pingerRoute).response()
        val messageValue = Gson().fromJson(message, String::class.java)
        println("$message received...")
        return "$message received..."
    }
}