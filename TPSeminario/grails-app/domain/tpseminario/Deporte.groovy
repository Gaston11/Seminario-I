package tpseminario

class Deporte {

	String nombre
	int cantidadCupos
	List<Alumno> listaInscriptos
	String resultado
	Date horaInicio
	//espacio
	//estado

    static constraints = {
    	nombre black: false, nullable: false
    	cantidadCupos black: false, nullable: false, min: 0
    	resultado nullable: false
    }

    Deporte (String unNombre, int cantidad ){
    	nombre = unNombre
    	cantidadCupos = cantidad
    }

    void inscripcion(Alumno unAlumno){
    	listaInscriptos.add(unAlumno)
    }

    void establecerHorario( Date hora){
    	horaInicio = hora
    }

    void establecerResultado(String unResultado){
    	resultado = unResultado
    }


}
