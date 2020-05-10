package TPSeminario.componentes
import TPSeminario.logicaJuego.*

class Alumno {

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
    	nombre black: false, nullable: false
    	telefono black: false, nullable: true
    	edad black: true, nullable: false, min: 0, max: 100
    	fechaNacimiento black: false, nullable: false
    }

    //Alumno( unaFecha,  unNombre,  unTelefono, edad){
    	//reputacion = new Reputacion()
    //	this.fechaNacimiento = unaFecha
    //	this.nombre = unaFecha
    //	this.telefono = unTelefono
    //    this.edad = edad
    //}

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