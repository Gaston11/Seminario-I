package tpseminario

class AlumnoController {


	static allowedMethods = [save: 'POST',
                             update: 'PUT',
                             delete: 'DELETE',]

    def index() { 
    	params.max = Math.min(max ?: 10, 100)
        List<Alumno> alumnoList = alumnoService.list(params)
        respond alumnoList, model: [studentCount: alumnoService.count()]
    }

    def create(){
    	//respond new Alumno(params)
    }
}
