package tpseminario

import grails.gorm.transactions.Transactional

@Transactional
class DeporteService {

    def getAll() {
    	Deporte.where{}.findAll()
    }

    def getBy(int id){
    	Deporte.get(id)
    }

    def update(Deporte deporte){
    	//el organizador no se puede cambiar
    	def deporteOld = Deporte.get(deporte.id)
    	deporteOld.cantidadCuposPorEquipo = deporte.cantidadCuposPorEquipo
    	deporteOld.nombre = deporte.nombre
    	deporteOld.save()

    }

    def save(String nombre, int cantidad, Alumno alumno){
    	def deporte = new Deporte(nombre, cantidad, alumno)
    	
    }

    def delete(int id){
    	def deporte = Deporte.get(id)
    	deporte.delete()
    }
}
