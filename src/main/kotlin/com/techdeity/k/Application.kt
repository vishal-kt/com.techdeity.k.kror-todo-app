package com.techdeity.k

import com.techdeity.k.plugins.*
import io.ktor.server.application.*
import kotlinx.serialization.Serializable
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.Json.Default.decodeFromJsonElement
import kotlinx.serialization.json.Json.Default.encodeToString



@Serializable
data class Player(val name:String,val level:Int)
fun main(args: Array<String>) {
 io.ktor.server.netty.EngineMain.main(args)




//    val player  = Player("vishal",66)
//    val j2s = Json.encodeToString(player)
//    println("Serialized :$j2s")
//
//    val restorePlayer = Json.decodeFromString<Player>(j2s)
//    println("Restored :$restorePlayer")

}

fun Application.module() {
    configureSerialization()
    configureMonitoring()
    configureHTTP()
    configureRouting()


}


