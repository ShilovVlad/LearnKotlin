package org.example.learnkotlin.general

import java.time.LocalDate
import kotlin.test.Test


class MainFileKtTest {
    @Test
    fun someTest()  {
        val cntr = Contract("123", LocalDate.of(2020,12,25), "OOO Primer")
        cntr.printContract()
    }


}