package tpdeportivo.componentes

class Reputacion {

    int cantidadDeEstrellas
    int cantidadDeCalificaciones =0
    int sumatoriaCalificaciones

    static constraints = {
        cantidadDeEstrellas range: 0..5, blank: false, nullable: false
        cantidadDeCalificaciones min: 0, blank: false, nullable: false
        sumatoriaCalificaciones min: 0, blank: false, nullable: false
    }

    void calificar(int calificacion){
        cantidadDeCalificaciones++
        sumatoriaCalificaciones = sumatoriaCalificaciones + calificacion
        cantidadDeEstrellas = sumatoriaCalificaciones/cantidadDeCalificaciones
    }
}