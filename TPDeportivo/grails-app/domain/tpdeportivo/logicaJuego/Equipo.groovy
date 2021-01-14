package tpdeportivo.logicaJuego
import tpdeportivo.*

enum Estado {
    ABIERTO,CERRADO
}

class Equipo {
    String nombreEquipo
	List<Alumno> listaAlumnos
    int maximoAlumnos
    Estado estado = ABIERTO

    static constraints = {
        nombre black: false, nullable: false
        listaAlumnos black: true, nullable: true,editable:false
        maximoAlumnos black: false max: maximoAlumnos
        estado black: false, nullable: false
    }

    Equipo (int maximo){
        maximoAlumnos = maximo
    }

    public void agregarAlumnno(Alumno unAlumno){
        if (listaAlumnos.size() < maximoAlumnos)
            listaAlumnos.add(unAlumno)
            else estado = CERRADO
    }

    public void eliminarAlumno(Alumno unAlumno){
        listaAlumnos.remove(unAlumno)
    }

    @Override
    public String toString() {
        return this.nombreEquipo;
    }
}
