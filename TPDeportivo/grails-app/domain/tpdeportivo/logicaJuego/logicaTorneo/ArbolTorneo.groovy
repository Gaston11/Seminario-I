package tpdeportivo.logicaJuego.logicaTorneo
import tpdeportivo.logicaJuego.*

class ArbolTorneo {

    Nodo raiz = null

    static constraints = {
    }

    Nodo getRaiz() {
        return raiz;
    }
 
    void setRaiz(Encuentro encuentro) {
        Nodo nodo = new Nodo(encuentro) 
        this.raiz = nodo;
    }

    void setRaiz(Nodo nodo) {
        this.raiz = nodo;
    }

    void agregarNodo(Nodo nodo){
        if(raiz == null){
            this.setRaiz(nodo)
        } 
        else{
            if(raiz.getHojaDerecha() == null){
                raiz.setHojaDerecha(nodo)
            }
            else{
                (raiz.setHojaIquierda(nodo))
            }
        }
    }

}

