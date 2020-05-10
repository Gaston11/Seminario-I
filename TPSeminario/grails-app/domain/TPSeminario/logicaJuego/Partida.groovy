package TPSeminario.logicaJuego

class Partida {

    enum Estado {
        ENCURSO,TERMINADO,PENDIENTE
    }

	Equipo equipo1
	Equipo equipo2
	Estado estado = Estado.PENDIENTE
	String resultado
	Equipo equipoGanador = null

    static constraints = { 
    }

    Partida(Equipo equipo1, Equipo equipo2){
    	this.equipo1 = equipo1
    	this.equipo2 = equipo2
    }

    Partida(){
    	//Partida sin parametros
    }

    void cargarResultado(String unResultado){
    	this.resultado = unResultado
    	this.modificarAEstadoTerminado();
    }

    void cargarGanador(Equipo unEquipo){
    	equipoGanador = unEquipo
    }

    Equipo getEquipo1(){
    	this.equipo1;
    }

    Equipo getEquipo2(){
    	this.equipo2;
    }

    private void modificarAEstadoTerminado(){
    	this.estado = Estado.TERMINADO
    }

    public void modificarEstado(Estado unEstado){
    	this.estado = unEstado
    }

    public Equipo getGanadorPartidaTerminada(){
		return equipoGanador
    }

}
