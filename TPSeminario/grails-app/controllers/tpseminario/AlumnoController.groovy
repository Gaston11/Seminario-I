package tpseminario
import static org.springframework.http.HttpStatus.*
import grails.validation.ValidationException

class AlumnoController {

    AlumnoService alumnoService 

	static allowedMethods = [ save: "POST"]

    def index() { 
    	//params.max = Math.min(max ?: 10, 100)
        //List<Alumno> alumnoList = alumnoService.list(params)
        //respond alumnoList, model: [studentCount: alumnoService.getAll()]
    }

    def create(){
        respond new Alumno()
    }


    //def show(Long id) {
    //    respond alumnoService.getBy(id)
    //}

    def save(Alumno alumno) {
        if (alumno == null) {
            notFound()
           return
        }

        try {
            alumnoService.save(alumno)
        } catch (ValidationException e) {
            respond alumno.errors, view:'create'
            return
        }

        request.withFormat {
           form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'alumno.label', default: 'Alumno'), alumno.id])
                redirect alumno
            }
            '*' { respond alumno, [status: CREATED] }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'alumno.label', default: 'Alumno'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
