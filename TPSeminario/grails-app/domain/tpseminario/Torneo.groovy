package tpseminario
import componentes.*


class Torneo {
    
    int cantidadDeCupos
    Deporte deporte
    Alumno organizador
    List<Equipo> listaEquipos

    static constraints = {
        cantidadDeCupos min: 0, black: false, nullable: false
    }

	Torneo(Deporte unDeporte, Alumno unAlumno){
        deporte = unDeporte
        organizador = unAlumno
    }

	
	void calificarTorneo(int calificacion){
        organizador.calificar(calificacion)
    }

    void establecerCupos(int cantidad){
    	cantidadDeCupos = cantidad
    }

    void agregarEquipo(Equipo unEquipo ){
    	listaEquipos.add(unEquipo)
    }

    

}


