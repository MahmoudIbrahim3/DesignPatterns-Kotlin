package state_pattern

class DirectionService() {

    private lateinit var service: Service

    fun getETA(){
        service.getETA()
    }

    fun getDirection(){
        service.getDirection()
    }

    fun setService(service: Service) {
        this.service = service
    }
}
