package tpdeportivo.logicaJuego

enum EstadoEncuentro {
        ENCURSO,TERMINADO,PENDIENTE
    }

class Encuentro {

    Equipo equipo1
    Equipo equipo2
    EstadoEncuentro estado = EstadoEncuentro.PENDIENTE
    String resultado
    Equipo equipoGanador = null
    Date horaInicio

    static constraints = {
        equipo1 black: true, nullable: true,editable:false
        equipo2 black: true, nullable: true,editable:false
        resultado black: true
        equipoGanador black: true, nullable: true,editable:false
        horaInicio black: false, nullable: false
    }

    void cargarResultado(String unResultado){
        this.resultado = unResultado
        this.modificarAEstadoTerminado();
    }

    private void modificarAEstadoTerminado(){
        this.estado = EstadoEncuentro.TERMINADO
    }

    public void modificarEstado(Estado unEstado){
        this.estado = unEstado
    }
}
