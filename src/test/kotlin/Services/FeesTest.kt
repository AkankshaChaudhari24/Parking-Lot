package Services

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import java.time.LocalDateTime

class FeesTest{
    @Test
    fun `should test fees`() {
        val entryDateTime:LocalDateTime= LocalDateTime.now()
        val exitDateTime: LocalDateTime = LocalDateTime.now().plusHours(7)

        val fees= Fees.calculateFees(entryDateTime,exitDateTime)
        assertEquals(70,fees)
    }

}
