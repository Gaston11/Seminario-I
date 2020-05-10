package TPSeminario.logicaJuego.logicaTorneo
import TPSeminario.logicaJuego.*

class Nodo {

    static constraints = {

    }
 	
 	Partida partida
 
    Nodo hojaIzquierda;
    Nodo hojaDerecha;
 
    Nodo(Partida unaPartida) {
        this.partida = unaPartida
        this.hojaIzquierda = null
        this.hojaDerecha = null
    }
 
    void setPartida(Partida unaPartida ) {
        this.partida = unaPartida
    }
 
    Partida getPartida() {
        return this.partida
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
