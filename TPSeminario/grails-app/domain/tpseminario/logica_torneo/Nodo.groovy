package tpseminario.logica_torneo
import componentes.Partida

class Nodo {

    static constraints = {

    }
 	
 	Partida partida
 
    Nodo padre;
    Nodo hojaIzquierda;
    Nodo hojaDerecha;
 
    Nodo(Partida unaPartida) {
        this.partida = unaPartida
        this.padre = null
        this.hojaIzquierda = null
        this.hojaDerecha = null
    }
 
    void setPartida(Partida unaPartida ) {
        this.partida = unaPartida
    }
 
    Partida getPartida() {
        return this.partida
    }
 
    Nodo getPadre() {
        return padre
    }
 
    void setPadre(Nodo padre) {
        this.padre = padre
    }
 
    Nodo getHojaIzquierda() {
        return hojaIzquierda
    }
 
    void setHojaIzquierda(Nodo hojaIzquierda) {
        this.hojaIzquierda = hojaIzquierda
    }
 
    Nodo getHojaDerecha() {
        return hojaDerecha;
    }
 
    void setHojaDerecha(Nodo hojaDerecha) {
        this.hojaDerecha = hojaDerecha;
    }

}
