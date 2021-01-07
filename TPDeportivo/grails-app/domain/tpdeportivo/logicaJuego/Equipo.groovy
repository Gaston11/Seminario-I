package tpdeportivo.logicaJuego
import tpdeportivo.*

class Equipo {
    String nombreEquipo
	List<Alumno> listaAlumnos

    static constraints = {
        nombre black: false, nullable: false
        listaAlumnos black: true, nullable: true,editable:false
    }

    public void agregarAlumnno(Alumno unAlumno){
        listaAlumnos.add(unAlumno)
    }

    public void eliminarAlumno(Alumno unAlumno){
        listaAlumnos.remove(unAlumno)
    }

    @Override
    public String toString() {
        return this.nombreEquipo;
    }
}
