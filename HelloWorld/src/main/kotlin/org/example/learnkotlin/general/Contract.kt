package org.example.learnkotlin.general

import java.time.LocalDate

class Contract(
    var number: String,
    var date: LocalDate,
    var contragent: String
)
{
    fun printContract(){
        println("Contract # $number by $date with $contragent")
    }
}