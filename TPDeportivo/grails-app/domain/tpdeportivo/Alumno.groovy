package tpdeportivo

class Alumno {

    String nombre
    Date fechaNacimiento
    String telefono
    
    static hasMany = [deportes: Deporte]

    static constraints = {
    	nombre black: false, nullable: false
    	fechaNacimiento black: false, nullable: false
        telefono black: false, nullable: true
    	
    }

    @Override
    public String toString() {
        return this.nombre;
    }

    
}
