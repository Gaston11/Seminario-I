package tpseminario
import componentes.*

class Alumno {

    int id
    Date fechaNacimiento
    String nombre
    String telefono
    int edad
    Reputacion reputacion   
    List<Deporte> listaDeportes

    static mapping = {
        id generator: 'uuid'
    }

    static constraints = {
    	nombre black: false, nullable: false
    	telefono black: false, nullable: false
    	edad black: true, nullable: true, min: 0, max: 100
    	fechaNacimiento black: false, nullable: false
    }

    Alumno(Date unaFecha, String unNombre, String unTelefono){
    	//reputacion = new Reputacion()
    	this.fechaNacimiento = unaFecha
    	this.nombre = unaFecha
    	this.telefono = unTelefono
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
