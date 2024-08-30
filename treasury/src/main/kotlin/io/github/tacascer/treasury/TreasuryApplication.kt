package io.github.tacascer.treasury

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TreasuryApplication

fun main(args: Array<String>) {
    runApplication<TreasuryApplication>(*args)
}
