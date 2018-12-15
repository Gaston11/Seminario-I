package tpseminario
import static org.springframework.http.HttpStatus.*

class DeporteController {

    DeporteService deporteService

    static allowedMethods = [ save: "POST"]


    def index(){
    	
    }

    def create(){
        respond deporteService.save(params.nombre, params.cantidad, params.alumno)
    }
}
