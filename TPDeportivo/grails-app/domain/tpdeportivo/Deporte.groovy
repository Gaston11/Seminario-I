package tpdeportivo

enum Espacio {
    GIMNASIO, SALA1, SALA2
}
enum Estado {
    ENCURSO,TERMINADO,PENDIENTE
}

class Deporte {
    
    int id
	String nombre
	Date horaInicio
	Espacio espacio
	Estado estado  
    int cantidadCupos 
    String resultado

	static hasMany = [alumnos: Alumno]

    static constraints = {
    	nombre black: false, nullable: false
        horaInicio black: false, nullable: false
        espacio black: false, nullable: false
        estado black: false, nullable: false
    	cantidadCupos black: false, nullable: false, min: 0
        resultado black: true, nullable: true,editable:false
        alumnos black: true, nullable: true,editable:false
    }

    @Override
    public String toString() {
        return this.nombre;
    }
}
