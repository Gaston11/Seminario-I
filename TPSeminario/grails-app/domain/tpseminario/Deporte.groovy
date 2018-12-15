package tpseminario
import componentes.*

enum Espacio {
    GIMNASIO, SALA1, SALA2
}
enum Estado {
    ENCURSO,TERMINADO,PENDIENTE
}

class Deporte {

	//Alumno organizador
    int id
    int id_organizador 
	String nombre
	int cantidadCuposPorEquipo
	//List<Alumno> listaInscriptos
	//int resultado
	Date horaInicio
	Espacio espacio
	Estado estado

    static mapping = {
        id generator: 'uuid'
        //id_organizador foreign
    }

    static constraints = {
    	nombre black: false, nullable: false
    	cantidadCupos black: false, nullable: false, min: 0
    	resultado nullable: false
    }

    Deporte (String unNombre, int cantidad, Alumno unAlumno ){
    	nombre = unNombre
    	cantidadCuposPorEquipo = cantidad
    	organizador = unAlumno
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
