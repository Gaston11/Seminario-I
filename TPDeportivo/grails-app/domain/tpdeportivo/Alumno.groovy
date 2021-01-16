package tpdeportivo
import tpdeportivo.logicaJuego.*

class Alumno {

    String nombre
    Date fechaNacimiento
    String telefono
    String email
    //Equipo equipo

    static hasMany = [deportes: Deporte]

    static constraints = {
        nombre black: false, nullable: false
        fechaNacimiento black: false, nullable: false
        telefono black: false, nullable: true
        email blank:false, email:true 
    }

    @Override
    public String toString() {
        return this.nombre;
    }

    //public void crearEquipo(int maximo){
      //  Equipo unEquipo = new Equipo(maximo)
        //this.equipo = unEquipo 
    //} 
}

