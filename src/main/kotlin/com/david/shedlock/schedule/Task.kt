package com.david.shedlock.schedule


import net.javacrumbs.shedlock.spring.annotation.SchedulerLock
import org.springframework.scheduling.annotation.Async
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component
import java.time.LocalDateTime

@Component
class Task {

    @Scheduled(fixedRate = 3000)
    @SchedulerLock(name = "myscheduledTask")
    @Async
    fun refreshPricingParameters() {
        println("Executed Task::::"+LocalDateTime.now())
        Thread.sleep(3000)
    }
}