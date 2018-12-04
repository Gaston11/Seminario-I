package tpseminario
import componentes.*

class Alumno {

    Date fechaNacimiento
    String nombre
    String telefono
    int edad
    Reputacion reputacion   
    List<Deporte> listaDeportes

    static constraints = {
    	nombre black: false, nullable: false
    	telefono black: false, nullable: false
    	edad black: false, nullable: false, min: 0, max: 100
    	fechaNacimiento black: false, nullable: false
    }

    Alumno(){
    	reputacion = new Reputacion()
    }

    void calificar(int calificacion){
    	reputacion.calificar(calificacion)
    }

    void crearDeporte(String unNombre, int cantidad){
    	deporte = new Deporte(unNombre, cantidad, this)
    	listaDeportes.add(deporte)
    }

    void calificarDeporte(Deporte unDeporte, int unaCalificacion){
    	
    	 if ( listaDeportes.contains(unDeporte) ) 
    	 	unDeporte.calificar(unaCalificacion)
    }

    
}
