package tpseminario

import grails.gorm.transactions.Transactional

@Transactional
class AlumnoBisService {

    def getAll() {
    	AlumnoBis.where{}.findAll()
    }

    def getBy(int id){
    	AlumnoBis.get(id)
    }

    def update(Alumno alumno){
    	def alumnoOld = AlumnoBis.get(alumno.id)
    	alumnoOld.fechaNacimiento = alumno.fechaNacimiento
    	alumnoOld.nombre = alumno.nombre
    	alumnoOld.telefono = alumno.telefono
    	alumnoOld.save()

    }

    def save( nombre, telefono, fechaNacimiento, edad){
    	def alumno = new AlumnoBis(fechaNacimiento,nombre,telefono, edad)
    	
    }

    def delete(int id){
    	def alumno = AlumnoBis.get(id)
    	alumno.delete()
    }
}
