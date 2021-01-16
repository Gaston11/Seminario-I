package tpdeportivo

import grails.gorm.services.Service

@Service(Deporte)
abstract class DeporteService implements IDeporteService {

   void generarDeporte(String nombre){
		Deporte deporte = new Deporte()
		deporte.nombre = nombre
		deporte.espacio = Espacio.GIMNASIO
		deporte.estado = Estado.ENCURSO

		deporte.save()


	}

   void suscribir(Alumno alumno){
   		//if(!Deporte.alumnos.contains(alumno)){
   		//	Deporte.alumnos.add(alumno)
   		//	Deporte.cantidadCupos -= 1
   		//}
   		
   }
    
}
