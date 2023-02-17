import Models.Ticket
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class parkingLotTest {
    private val parkingLot = parkingLot()
    private val ticket = parkingLot.park()

    @Test
    fun park() {
        assertEquals(1, ticket!!.ticketNumber)
        assertEquals(1, ticket.spotNumber)
    }

    @Test
    fun unPark() {
        val receipt = parkingLot.unPark(ticket!!)
        assertEquals(1,receipt.receiptNumber)
        assertEquals(0,receipt.fees)

    }
}