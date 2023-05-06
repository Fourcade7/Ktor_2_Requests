package com.example.plugins

import io.ktor.server.routing.*
import io.ktor.server.response.*
import io.ktor.server.application.*
import io.ktor.server.request.*

fun Application.configureRouting() {
    routing {
        get("/") {
            call.respondText("Hello World!")
        }
    }
}


fun Application.requests(){
    routing {
        get("/req"){
            println("URI ${call.request.uri}")
            println("Headers ${call.request.headers}")
            println("Connection ${call.request.headers["Connection"]}")
            println("QueryParameters ${call.request.queryParameters.names()}")
            println("name ${call.request.queryParameters["name"]}")
            println("surname ${call.request.queryParameters["surname"]}")
            call.respond("Request")
        }
    }
}
