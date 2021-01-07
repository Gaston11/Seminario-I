
package tpdeportivo


interface IDeporteService {

    Deporte get(Serializable id)

    List<Deporte> list(Map args)

    Long count()

    void delete(Serializable id)

    Deporte save(Deporte deporte)

    void suscribir(Alumno alumno)
}