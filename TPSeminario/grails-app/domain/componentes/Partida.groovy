package componentes

class Partida {

	Equipo equipo1
	Equipo equipo2
	//estado
	String resultado

    static constraints = {

    }

    Partida(Equipo equipo1, Equipo equipo2){
    	this.equipo1 = equipo1
    	this.equipo2 = equipo2
    }

    void cargarResultado(String unResultado){
    	this.resultado = unResultado
    	this.modificarEstado();
    }

    private void modificarEstado(){
    	//estado
    } 
}
