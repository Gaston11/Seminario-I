package tpseminario
import componentes.*


class Torneo {
    
    int maximaCantidadDeEquipos
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

    void establecerCantidadMaximaDeEquipos(int cantidad){
    	maximaCantidadDeEquipos = cantidad
    }

    void agregarEquipo(Equipo unEquipo ){
    	if (listaEquipos.size <= this.maximaCantidadDeEquipos)
    		listaEquipos.add(unEquipo)
    }

    void generarTorneo(){
    	
    }

}


