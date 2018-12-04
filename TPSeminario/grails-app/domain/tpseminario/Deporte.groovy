package tpseminario

class Deporte {

	Alumno organizador
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

    Deporte (String unNombre, int cantidad, Alumno unAlumno ){
    	nombre = unNombre
    	cantidadCupos = cantidad
    	organizador = unAlumno
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

    void calificar(int calificacion){
    	organizador.calificar(calificacion)
    }


    

}
