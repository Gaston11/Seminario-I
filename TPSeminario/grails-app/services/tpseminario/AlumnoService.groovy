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

    def save( nombre,  telefono,  fechaNacimiento, edad){
        if(edad != null){
        	def alumno = new Alumno(fechaNacimiento,nombre,telefono,edad)
        }
    	
    }

    def delete(int id){
    	def alumno = Alumno.get(id)
    	alumno.delete()
    }
}
