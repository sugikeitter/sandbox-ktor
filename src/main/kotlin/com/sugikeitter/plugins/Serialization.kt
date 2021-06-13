package com.sugikeitter.plugins

import io.ktor.serialization.*
import io.ktor.features.*
import io.ktor.application.*
import io.ktor.response.*
import io.ktor.routing.*

fun Application.configureSerialization() {
    install(ContentNegotiation) {
        json()
    }

    routing {
        get("/json/helloworld") {
            call.respond(mapOf("hello" to "world"))
        }
        get("/json/{name}") {
            call.respond(mapOf("hello" to call.parameters["login"]))
        }
    }
}
