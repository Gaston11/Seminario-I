package tpseminario
import componentes.*

class AlumnoBis {

    int id
    Date fechaNacimiento
    String nombre
    String telefono
    int edad
    //Reputacion reputacion   
    //List<Deporte> listaDeportes

    static mapping = {
        id generator: 'uuid'
    }

    static constraints = {
    	nombre blank: false, nullable: false
    	telefono blank: false, nullable: true
    	edad blank: true, nullable: true, min: 0, max: 100
    	fechaNacimiento blank: false, nullable: false
    	//reputacion blank: false, nullable:true
    }

    AlumnoBis(Date unaFecha, String unNombre, String unTelefono, int unaedad){
    	//reputacion = new Reputacion()
    	this.fechaNacimiento = unaFecha
    	this.nombre = unaFecha
    	this.telefono = unTelefono
    	this.edad = edad
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
