package componentes

enum Estado {
    ENCURSO,TERMINADO,PENDIENTE
}

class Partida {

	Equipo equipo1
	Equipo equipo2
	Estado estado = PENDIENTE
	String resultado
	boolean ganadorEquipo1 = false
	boolean ganadorEquipo2 = false

    static constraints = { 
    }

    Partida(Equipo equipo1, Equipo equipo2){
    	this.equipo1 = equipo1
    	this.equipo2 = equipo2
    }

    void cargarResultado(String unResultado){
    	this.resultado = unResultado
    	this.modificarAEstadoTerminado();
    }

    void cargarGanador(Equipo unEquipo){
    	if (unEquipo == this.equipo1){
    		this.ganadorEquipo1 = true
    	}	
    		else ganadorEquipo2 = true
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

    /*
    public Equipo getGanador(){
    	Equipo equipo = null
		if (estado.TERMINADO){
			equipo = 
		}    	
    }
    */


}
