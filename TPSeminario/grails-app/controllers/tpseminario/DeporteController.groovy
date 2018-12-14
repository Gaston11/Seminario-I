package tpseminario

class DeporteController {

    DeporteService deporteService

    def index(){
    	
    }

    def create(){
        respond deporteService.save(params.nombre, params.cantidad, params.alumno)
    }
}
