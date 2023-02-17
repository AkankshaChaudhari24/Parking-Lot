import Models.Receipt
import Models.Ticket
import Services.Fees
import Services.Spot
import java.time.LocalDateTime

class parkingLot {
    private var ticketCounter: Int = 0
    var receiptCounter: Int = 0
    private val spots = Spot()
    fun park(): Ticket? {
        return if (spots.checkIfSpotAvailable()) {
            val spotNumber = spots.getFreeSlot()
            Ticket(++ticketCounter, spotNumber)
        } else {
            null
        }
    }

    fun unPark(ticket: Ticket): Receipt {
        val entryDateTime = ticket.entryDateTime
        val existDateTime: LocalDateTime = LocalDateTime.now()
        spots.freeSpot(ticket.spotNumber)
        val fees = Fees.calculateFees(entryDateTime, existDateTime)
        return Receipt(++receiptCounter, entryDateTime, existDateTime, fees)
    }

}