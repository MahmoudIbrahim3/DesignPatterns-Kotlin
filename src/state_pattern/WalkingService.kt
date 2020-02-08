package state_pattern

class WalkingService : Service {
    override fun getETA() {
        println("Calculating ETA (Walking)")
    }

    override fun getDirection() {
        println("Calculating Direction (Walking)")
    }
}