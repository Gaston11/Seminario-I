package tpseminario
import componentes.*

class Deporte {

	//Alumno organizador
    int id_organizador 
	String nombre
	int cantidadCupos
	//List<Alumno> listaInscriptos
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
    	id_organizador = unAlumno.id
    }

    Partida crearPartida(Equipo equipo1, Equipo equipo2){
    	//listaInscriptos.add(unAlumno)
        return new Partida(equipo1, equipo2)
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
