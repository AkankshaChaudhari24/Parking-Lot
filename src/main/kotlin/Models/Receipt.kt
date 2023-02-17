package Models

import java.time.LocalDateTime

data class Receipt(
    val receiptNumber: Int,
    val entryDateTime: LocalDateTime,
    val exitDateTime: LocalDateTime,
    val fees: Long
) {}