import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class parkingLotTest {

    @Test
    fun park() {

        val parkingLot = parkingLot()
        val ticket = parkingLot.park()


        assertEquals(1, ticket!!.ticketNumber)
        assertEquals(1, ticket.spotNumber)
    }

    @Test
    fun unPark() {
        val parkingLot = parkingLot()
        val ticket = parkingLot.park()


        val receipt = parkingLot.unPark(ticket!!)
        assertEquals(1,receipt.receiptNumber)
        assertEquals(0,receipt.fees)

    }
}