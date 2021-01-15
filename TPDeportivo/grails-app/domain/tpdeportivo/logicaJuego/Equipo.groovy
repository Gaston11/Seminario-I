package tpdeportivo.logicaJuego
import tpdeportivo.Alumno

enum Estado {
    ABIERTO,CERRADO
}

class Equipo {
    String nombreEquipo
    List<Alumno> listaAlumnos
    int maximoAlumnos
    Estado estado = Estado.ABIERTO

    static constraints = {
        nombreEquipo black: false, nullable: false
        listaAlumnos black: true, nullable: true,editable:false
        maximoAlumnos black: false, max: 4 // Setear maximo ??
        estado black: false, nullable: false
    }

    Equipo (int maximo){
        maximoAlumnos = maximo
    }

    public void agregarAlumnno(Alumno unAlumno){
        if (listaAlumnos.size() < maximoAlumnos)
            listaAlumnos.add(unAlumno)
            else estado = Estado.CERRADO
    }

    public void eliminarAlumno(Alumno unAlumno){
        listaAlumnos.remove(unAlumno)
    }

    @Override
    public String toString() {
        return this.nombreEquipo;
    }
}