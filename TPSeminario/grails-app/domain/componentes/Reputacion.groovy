package componentes

class Reputacion {
    
    int cantidadDeEstrellas
    int cantidadDeCalificaciones
    int sumatoriaCalificaciones

    static constraints = {
        cantidadDeEstrellas range: 0..5, black: false, nullable: false
		cantidadDeCalificaciones min: 0, black: false, nullable: false
		sumatoriaCalificaciones min: 0, black: false, nullable: false
    }

	Reputacion(){
        cantidadDeEstrellas = 0
    	cantidadDeCalificaciones = 0
	sumatoriaCalificaciones = 0
    }

	
	void calificar(int calificacion){
     	cantidadDeCalificaciones++
		sumatoriaCalificaciones = sumatoriaCalificaciones + calificacion
		cantidadDeEstrellas = sumatoriaCalificaciones/cantidadDeCalificaciones

    }

	
}
