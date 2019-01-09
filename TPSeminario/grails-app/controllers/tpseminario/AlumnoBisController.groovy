package tpseminario
import static org.springframework.http.HttpStatus.*
import grails.validation.ValidationException

class AlumnoBisController {

	AlumnoBisService alumnoBisService 


	//static allowedMethods = [ create: "POST"]

    def index() { }

    def create(){
        respond alumnoBisService.save(params.nombre, params.telefono, params.fechaNacimiento, params.edad)
    }
}
