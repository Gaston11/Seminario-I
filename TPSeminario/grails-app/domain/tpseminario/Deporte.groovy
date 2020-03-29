package tpseminario
import componentes.*

enum Espacio {
    GIMNASIO, SALA1, SALA2
}

class Deporte {

    int id 
	String nombre
	int cantidadDeIntegrantesPorEquipo
	Espacio espacio

    static mapping = {
        id generator: 'uuid'
        //id_organizador foreign
    }

    static constraints = {
    	nombre black: false, nullable: false
    	cantidadCupos black: false, nullable: false, min: 0
    }

    Deporte (String unNombre, int cantidad ){
    	nombre = unNombre
    	cantidadDeIntegrantesPorEquipo = cantidad
    }

}
