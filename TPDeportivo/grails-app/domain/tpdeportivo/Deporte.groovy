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
    Espacio espacio
    Estado estado  

    //static hasMany = [alumnos: Alumno]

    static constraints = {
        nombre black: false, nullable: false
        espacio black: false, nullable: false
        estado black: false, nullable: false
        alumnos black: true, nullable: true, editable:false
    }

    @Override
    public String toString() {
        return this.nombre;
    }
}
