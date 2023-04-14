package com.david.shedlock

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.scheduling.annotation.EnableScheduling

@SpringBootApplication
//@EnableScheduling
class ShedlockApplication

fun main(args: Array<String>) {
	runApplication<ShedlockApplication>(*args)
}
