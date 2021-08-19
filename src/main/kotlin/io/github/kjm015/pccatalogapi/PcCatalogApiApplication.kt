package io.github.kjm015.pccatalogapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PcCatalogApiApplication

fun main(args: Array<String>) {
    runApplication<PcCatalogApiApplication>(*args)
}
