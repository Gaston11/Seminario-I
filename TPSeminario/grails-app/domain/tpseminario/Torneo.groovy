package tpseminario


class Torneo {
    
    int cantidadDeCupos
    Deporte deporte
    Alumno organizador

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

    

}


