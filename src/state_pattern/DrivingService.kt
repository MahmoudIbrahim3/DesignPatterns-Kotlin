package state_pattern

class DrivingService : Service {
    override fun getETA() {
        println("Calculating ETA (Driving)")
    }

    override fun getDirection() {
        println("Calculating Direction (Driving)")
    }
}