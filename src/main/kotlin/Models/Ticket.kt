package Models

import java.time.LocalDateTime

data class Ticket(
    val ticketNumber: Int,
    val spotNumber: Int,
    val entryDateTime: LocalDateTime = LocalDateTime.now()
) {}