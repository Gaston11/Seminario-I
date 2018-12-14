package tpseminario

import grails.gorm.transactions.Transactional

@Transactional
class TorneoService {

    def getAll() {
    	Torneo.where{}.findAll()
    }

    def getBy(int id){
    	Torneo.get(id)
    }

    def update(Torneo torneo){
    	//el organizador no se puede cambiar
    	def torneoOld = Torneo.get(torneo.id)
    	torneoOld.maximaCantidadDeEquipos = torneo.maximaCantidadDeEquipos
    	torneoOld.save()

    }

    def save(String nombre, int cantidad, Alumno alumno){
    	def torneo = new Torneo(nombre, cantidad, alumno)
    	
    }

    def delete(int id){
    	def torneo = Torneo.get(id)
    	torneo.delete()
    }
}
