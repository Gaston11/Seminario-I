package tpseminario
import componentes.*

class Alumno {

    Date fechaNacimiento
    String nombre
    String telefono
    int edad
    Reputacion reputacion   

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

    void crearDeporte(){
    	//hacer
    }

    void calificarDeporte(){
    	//hacer
    }

    
}
