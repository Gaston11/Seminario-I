package tpseminario.logica_torneo
import componentes.Partida

class ArbolTorneo {

	Nodo raiz

    static constraints = {
    }

 
    ArbolTorneo(  ) {
    }

    Nodo getRaiz() {
        return raiz;
    }
 
    void setRaiz(Partida partida) {
        Nodo nodo = new Nodo(partida) 
        this.raiz = nodo;
    }

    void setRaiz(Nodo nodo) {
        this.raiz = nodo;
    }



    void agregarNodo(Nodo nodo){
    	if (raiz == null){
    		this.setRaiz(nodo)
    	} else{
    		if (raiz.getHojaDerecha() == null){
    			raiz.setHojaDerecha(nodo)
                }else {
                    (raiz.setHojaIquierda(nodo))
                }
        }
    }

}
