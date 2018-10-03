package com.eliadp.pinger

import com.github.kittinunf.fuel.Fuel
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration


const val PONGER_ROUTE = "http://localhost:8081/table"


/**
 * The main entry point to the Pinger application.
 */
@EnableAutoConfiguration
@Configuration
internal class PingerApplication {
    @Bean
    fun controller() = PingerController().setPongerRoute(PONGER_ROUTE)
}

/**
 * Run the application
 * @param args The command line arguments
 */
fun main(args: Array<String>) {
    SpringApplication.run(PingerApplication::class.java, *args)

    val request = Fuel.post(PONGER_ROUTE).body("{ \"message\" : \"Ping\" }")
    request.headers["Content-Type"] = "application/json"
    request.response()
}