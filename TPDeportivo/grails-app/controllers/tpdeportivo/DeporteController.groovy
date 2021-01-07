package tpdeportivo
import static org.springframework.http.HttpStatus.*
import grails.validation.ValidationException

class DeporteController {

    DeporteService deporteService

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]


    def index(Integer max){
    	params.max = Math.min(max ?: 10, 100)
        respond deporteService.list(params), model:[deporteCount: deporteService.count()]
    }

    def create(){
        respond new Deporte(params)
    }

    def show(Long id) {
        respond deporteService.get(id)
    }

    def save(Deporte deporte) {
        if (deporte == null) {
            notFound()
           return
        }

        try {
            deporteService.save(deporte)
        } catch (ValidationException e) {
            respond deporte.errors, view:'create'
            return
        }

        request.withFormat {
           form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'deporte.label', default: 'Deporte'), deporte.id])
                redirect deporte
            }
            '*' { respond deporte, [status: CREATED] }
        }
    }

    def edit(Long id) {
        respond deporteService.get(id)
    }

    def update(Deporte deporte) {
        if (deporte == null) {
            notFound()
            return
        }

        try {
            deporteService.save(deporte)
        } catch (ValidationException e) {
            respond deporte.errors, view:'edit'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'deporte.label', default: 'Deporte'), deporte.id])
                redirect deporte
            }
            '*'{ respond deporte, [status: OK] }
        }
    }

    def delete(Long id) {
        if (id == null) {
            notFound()
            return
        }

        deporteService.delete(id)

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'deporte.label', default: 'Deporte'), id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    def suscribir(Alumno alumno){
        respond deporteService.suscribir(alumno)

    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'deporte.label', default: 'Deporte'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
