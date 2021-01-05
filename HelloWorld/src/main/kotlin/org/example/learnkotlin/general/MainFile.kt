package org.example.learnkotlin.general

import java.time.LocalDate

fun main() {
    println("Hello World!")
    val contr = Contract("123", LocalDate.of(2020, 12, 25), "OOO Romashka")
    contr.printContract()
    println("Contract number is ${contr.number}")
}
