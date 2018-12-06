package componentes
import tpseminario.*

class Equipo {

	String nombreEquipo
	List<Alumno> listaAlumnos

    static constraints = {
    }

    Equipo(String nombre){
    	nombreEquipo = nombre
    }

    void agregarAlumno(Alumno unAlumno){
    	listaAlumnos.add(unAlumno)
    }

    void eliminarAlumno(Alumno unAlumno){
    	listaAlumnos.remove(unAlumno)
    }
}
