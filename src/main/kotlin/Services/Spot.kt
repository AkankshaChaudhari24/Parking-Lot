package Services

import java.util.*

class Spot {
    private var spots = PriorityQueue<Int>()

    init {
        for (i in 1..100) {
            spots.add(i)
        }
    }

    fun checkIfSpotAvailable(): Boolean {
        return spots.isNotEmpty()
    }

    fun getFreeSlot(): Int {
        return spots.poll()
    }

    fun freeSpot(spotNumber: Int) {
        spots.add(spotNumber)
    }


}