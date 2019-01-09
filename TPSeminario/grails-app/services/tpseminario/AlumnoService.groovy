package tpseminario

import grails.gorm.transactions.Transactional

@Transactional
class AlumnoService {

    def getAll() {
    	Alumno.where{}.findAll()
    }

    def getBy(int id){
    	Alumno.get(id)
    }

    def update(Alumno alumno){
    	def alumnoOld = Alumno.get(alumno.id)
    	alumnoOld.fechaNacimiento = alumno.fechaNacimiento
    	alumnoOld.nombre = alumno.nombre
    	alumnoOld.telefono = alumno.telefono
    	alumnoOld.save()

    }

    def save( Alumno alumnoCreado){
        
        def alumno = alumnoCreado
        alumno.save()
    	
    }

    def delete(int id){
    	def alumno = Alumno.get(id)
    	alumno.delete()
    }
}
