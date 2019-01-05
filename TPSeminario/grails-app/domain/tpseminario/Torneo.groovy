package tpseminario
import componentes.*
import tpseminario.logica_torneo.*


class Torneo {
    
    int maximaCantidadDeEquipos
    Deporte deporte
    Alumno organizador
    List<Equipo> listaEquipos
    List<Partida> listaDePartidas
    ArbolTorneo arbolTorneo

    static constraints = {
        cantidadDeCupos min: 0, black: false, nullable: false
    }

	Torneo(Deporte unDeporte, Alumno unAlumno){
        deporte = unDeporte
        organizador = unAlumno
        arbolTorneo = new ArbolTorneo()

    }

	
	void calificarTorneo(int calificacion){
        organizador.calificar(calificacion)
    }

    void establecerCantidadMaximaDeEquipos(int cantidad){
    	maximaCantidadDeEquipos = cantidad
    }	

    void agregarEquipo(Equipo unEquipo ){
    	if (listaEquipos.size <= this.maximaCantidadDeEquipos)
    		listaEquipos.add(unEquipo)
    }

    void generarTorneo(){
    	int cantidadDePartidas = (this.listaEquipos.size)/2  
    	int resto = (this.listaEquipos.size)%2
    	
    	this.generarPartidas(cantidadDePartidas)

    }

    private void generarPartidas(int cantidadDePartidas){
                         
 		for (int i=0; i<=cantidadDePartidas; i=i + 2){
 			Partida unaPartida = this.deporte.crearPartida(listaEquipos[i],listaEquipos[i+1])
 			this.listaDePartidas.add(unaPartida)
 		}

 		this.agregarAlArbol()
	}

	private void agregarAlArbol(){
		partida = this.listaDePartidas.get(0)
		this.ArbolTorneo.setRaiz(partida)
	}

	private void tamanioTorneo(){
		// 2 4 8 16 32 64  equipos....
		// partidas 1 2 4 8 16 ...       
		// 

		// la cantidad de (equipos/2) tiene q ser menor o igual a la cantidad de partidas
		//
	}

	public void modificarPartida(String unResultado, Equipo equipoGanador ){
		Partida partida = this.arbolTorneo.getRaiz.getPartida()
		partida.cargarResultado(resultado)
		partida.cargarGanador(equipoGanador)
	}
	



}
