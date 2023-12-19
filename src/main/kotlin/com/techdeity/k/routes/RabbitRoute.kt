package com.techdeity.k.routes

import com.techdeity.k.data.model.Rabbit
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

private const val BASE_URL="http://192.168.243.244:8080"

private val rabbits = listOf(
    Rabbit("vishal","A Cute Brown Rabbit","$BASE_URL/rabbits/rabbit1.png"),
    Rabbit("vishal","A Cute Brown Rabbit","$BASE_URL/rabbits/rabbit2.png"),
    Rabbit("vishal","A Cute Brown Rabbit","$BASE_URL/rabbits/rabbit3.png"),
    Rabbit("vishal","A Cute Brown Rabbit","$BASE_URL/rabbits/rabbit4.png"),
    Rabbit("vishal","A Cute Brown Rabbit","$BASE_URL/rabbits/rabbit5.png"),
    Rabbit("vishal","A Cute Brown Rabbit","$BASE_URL/rabbits/rabbit6.png"),

    )

fun Route.randomRabbit(){

    get("/randomrabbit"){

        call.respond(HttpStatusCode.OK, rabbits.random())

    }

}