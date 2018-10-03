package com.eliadp.ponger

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration


const val PINGER_ROUTE = "http://localhost:8080/table"


/**
 * The main entry point to the Ponger application.
 */
@EnableAutoConfiguration
@Configuration
internal class PongerApplication {
    @Bean
    fun controller() = PongerController().setPingerRoute(PINGER_ROUTE)
}

/**
 * Run the application
 * @param args The command line arguments
 */
fun main(args: Array<String>) {
    SpringApplication.run(PongerApplication::class.java, *args)
}