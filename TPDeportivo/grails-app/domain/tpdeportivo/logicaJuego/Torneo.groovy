package tpdeportivo.logicaJuego

class Torneo {

    int maximaCantidadDeEquipos
    Deporte deporte
    Alumno organizador
    List<Equipo> listaEquipos
    List<Partida> listaDePartidas
    ArbolTorneo arbolTorneo = new ArbolTorneo()

    static constraints = {
        maximacantidadDeCupos min: 0, max: 4, black: false, nullable: false // probar con 4 equipos
        deporte nullable: false
        organizador nullable: false
    }

    void calificarTorneo(int calificacion){
        organizador.calificar(calificacion)
    }

    public void agregarEquipo(Equipo unEquipo){
        if (listaEquipos.size <= 4)
            listaEquipos.add(unEquipo)
    }

    public void generarPartidas(){
        Equipo equipo0 = this.listaEquipos.get(0)
        Equipo equipo1 = this.listaEquipos.get(1)
        Equipo equipo2 = this.listaEquipos.get(2)
        Equipo equipo3 = this.listaEquipos.get(3)

        Partida partida1 = new Partida(equipo0,equipo1);
        Partida partida2 = new Partida(equipo2,equipo3);

        this.listaDePartidas.add(partida1);
        this.listaDePartidas.add(partida2);
        this.generarArbol();
    }

    public List<Partida> getPartidas(){
        return this.listaDePartidas;
    }

    private void generarArbol(){
        this.arbolTorneo.setRaiz( new Partida() ) // partida en la raiz sin equipos
        Nodo nodo1 = new Nodo (this.listaDePartidas.get(0))
        Nodo nodo2 = new Nodo (this.listaDePartidas.get(1))

        this.arbolTorneo.agregarNodo(nodo1)
        this.arbolTorneo.agregarNodo(nodo2)
    }

    public Partida getPartidaFinal(Equipo unEquipo, Equipo otroEquipo){
        return new Partida(unEquipo, otroEquipo)
    }

    public Partida getPartidasIniciales(){
        
    }




}
