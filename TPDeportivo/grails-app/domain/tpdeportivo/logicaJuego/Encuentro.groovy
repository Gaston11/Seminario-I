package tpdeportivo.logicaJuego

enum Estado {
        ENCURSO,TERMINADO,PENDIENTE
    }

class Encuentro {

    Equipo equipo1
    Equipo equipo2
    Estado estado = Estado.PENDIENTE
    String resultado
    Equipo equipoGanador = null

    static constraints = {
        equipo1 black: true, nullable: true,editable:false
        equipo2 black: true, nullable: true,editable:false
        resultado black: true
        equipoGanador black: true, nullable: true,editable:false
    }

    void cargarResultado(String unResultado){
        this.resultado = unResultado
        this.modificarAEstadoTerminado();
    }

    private void modificarAEstadoTerminado(){
        this.estado = Estado.TERMINADO
    }

    public void modificarEstado(Estado unEstado){
        this.estado = unEstado
    }
}
