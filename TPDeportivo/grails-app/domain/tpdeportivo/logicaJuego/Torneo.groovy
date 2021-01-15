package tpdeportivo.logicaJuego
import tpdeportivo.*
import tpdeportivo.logicaJuego.logicaTorneo.*

class Torneo {

    int maximaCantidadDeEquipos
    Deporte deporte
    Alumno organizador
    List<Equipo> listaEquipos
    List<Encuentro> listaDeEncuentros
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
        if (listaEquipos.size() < 4)
            listaEquipos.add(unEquipo)
    }

    public void generarEncuentros(){
        Equipo equipo0 = this.listaEquipos.get(0)
        Equipo equipo1 = this.listaEquipos.get(1)
        Equipo equipo2 = this.listaEquipos.get(2)
        Equipo equipo3 = this.listaEquipos.get(3)

        Encuentro encuentro1 = new Encuentro(equipo0,equipo1);
        Encuentro encuentro2 = new Encuentro(equipo2,equipo3);

        this.listaDeencuentros.add(encuentro1);
        this.listaDeencuentros.add(encuentro2);
        this.generarArbol();
    }

    public List<Encuentro> getEncuentros(){
        return this.listaDeEncuentros;
    }

    private void generarArbol(){
        this.arbolTorneo.setRaiz( new Encuentro() ) // encuentro en la raiz sin equipos
        Nodo nodo1 = new Nodo (this.listaDeEncuentros.get(0))
        Nodo nodo2 = new Nodo (this.listaDeEncuentros.get(1))

        this.arbolTorneo.agregarNodo(nodo1)
        this.arbolTorneo.agregarNodo(nodo2)
    }

    public Encuentro getEncuentroFinal(Equipo unEquipo, Equipo otroEquipo){
        return new Encuentro(unEquipo, otroEquipo)
    }

    public Encuentro getEncuentrosIniciales(){

    }
}