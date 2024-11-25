package org.chatterbox

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ChatterBoxApplication

fun main(args: Array<String>) {
    runApplication<ChatterBoxApplication>(*args)
}