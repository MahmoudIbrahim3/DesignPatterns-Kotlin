package state_pattern

fun main() {
    val directionService = DirectionService()

    directionService.setService(DrivingService())
//    directionService.setService(WalkingService())

    directionService.getETA()
    directionService.getDirection()
}