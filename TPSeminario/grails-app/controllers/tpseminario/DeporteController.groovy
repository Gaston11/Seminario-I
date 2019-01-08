package tpseminario
import static org.springframework.http.HttpStatus.*

class DeporteController {

    DeporteService deporteService

    static allowedMethods = [ save: "POST"]


    def index(){
    	
    }

    def create(int id){
        respond deporteService.save(params.nombre, params.cantidad, id)
    }
}
