package tpdeportivo

import grails.gorm.services.Service

@Service(Deporte)
abstract class DeporteService implements IDeporteService {

    
   void suscribir(Alumno alumno){
   		if(!Deporte.alumnos.contains(alumno)){
   			Deporte.alumnos.add(alumno)
   			Deporte.cantidadCupos -= 1
   		}
   		
   }
    
}
