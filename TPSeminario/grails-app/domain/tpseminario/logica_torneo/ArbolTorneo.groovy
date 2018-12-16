package tpseminario.logica_torneo
import componentes.Partida

class ArbolTorneo {

    static constraints = {
    }

    Nodo raiz
 
    ArbolTorneo( Partida unaPartida ) {
        this.raiz = new Nodo( unaPartida )
    }
 
    ArbolTorneo( Nodo raiz ) {
        this.raiz = raiz;
    }
 
    Nodo getRaiz() {
        return raiz;
    }
 
    void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }


}
