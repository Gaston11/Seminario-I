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
        maximacantidadDeCupos min: 0, max: 4, black: false, nullable: false // probar con 4 equipos
        deporte nullable: false
        organizador nullable: false
    }

	Torneo(Deporte unDeporte, Alumno unAlumno){
        deporte = unDeporte
        organizador = unAlumno
        arbolTorneo = new ArbolTorneo()
    }

	void calificarTorneo(int calificacion){
        organizador.calificar(calificacion)
    }

    public void agregarEquipo(Equipo unEquipo){
    	if (listaEquipos.size <= this.maximaCantidadDeEquipos)
    		listaEquipos.add(unEquipo)
    }

    public void generarPartidas(){
    Equipo	equipo0 = this.listaEquipos.get(0)
    Equipo	equipo1 = this.listaEquipos.get(1)
    Equipo	equipo2 = this.listaEquipos.get(2)
    Equipo	equipo3 = this.listaEquipos.get(3)

    Partida partida1 = new Partida(equipo0,equipo1);
    Partida partida2 = new Partida(equipo2,equipo3);

    this.listaDePartidas.add(partida1);
    this.listaDePartidas.add(partida2);
    }

    public List<Partida> getPartidas(){
    	return this.listaDePartidas;
    }

    //public void modificarPartida()

    /*


    public void generarTorneo();

    {
                         
 		for (int i=0; i<=cantidadDePartidas; i=i + 2){
 			Partida unaPartida = this.deporte.crearPartida(listaEquipos[i],listaEquipos[i+1])
 			this.listaDePartidas.add(unaPartida)
 		}

 		CantidadesPartidas cantidadEnum = this.definirEnumerado(this.listaDePartidas.size())

 		this.agregarAlArbol(cantidadEnum)
	} 

		// 2 4 8 16  equipos....
		// Los torneos van a ser con estas cant de partidas 1 2 4 8 ...       
		// 

		// la cantidad de (equipos/2) tiene q ser menor o igual a la cantidad de partidas
		//

	public void modificarPartida(String unResultado, Equipo equipoGanador );
		//Partida partida = this.arbolTorneo.getRaiz.getPartida()
		//partida.cargarResultado(resultado)
		//partida.cargarGanador(equipoGanador)
	
	*/

}
