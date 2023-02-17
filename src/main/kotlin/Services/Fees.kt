package Services

import java.time.Duration
import java.time.LocalDateTime

class Fees {
    companion object{
        fun calculateFees(entryDateTime: LocalDateTime, exitDateTime: LocalDateTime): Long {
            val duration = Duration.between(entryDateTime, exitDateTime).toHours()
            return duration * 10
        }
    }

}