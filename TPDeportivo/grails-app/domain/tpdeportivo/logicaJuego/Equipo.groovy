package tpdeportivo.logicaJuego
import tpdeportivo.*

class Equipo {
    String nombreEquipo
	List<Alumno> listaAlumnos

    static constraints = {
    }

    Equipo(String nombre){
        nombreEquipo = nombreEquipo
    }

    void agregarAlumnno(Alumno unAlumno){
        listaAlumnos.add(unAlumno)
    }

    void eliminarAlumno(Alumno unAlumno){
        listaAlumnos.remove(unAlumno)
    }
}
