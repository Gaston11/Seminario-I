package tpdeportivo.logicaJuego.logicaTorneo
import tpdeportivo.logicaJuego.*

class Nodo {

    Encuentro encuentro
    Nodo hojaIzquierda
    Nodo hojaDerecha

    static constraints = {
    }

    Nodo(Encuentro unEncuentro) {
        this.encuentro = unEncuentro
        this.hojaIzquierda = null
        this.hojaDerecha = null
    }

    void setEncuentro(Encuentro unEncuentro ) {
        this.encuentro = unEncuentro
    }
 
    Encuentro getEncuentro() {
        return this.encuentro
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
