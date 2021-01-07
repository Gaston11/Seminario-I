package tpdeportivo

interface IAlumnoService {

    Alumno get(Serializable id)

    List<Alumno> list(Map args)

    Long count()

    void delete(Serializable id)

    Alumno save(Alumno alumno)

    void generarAlumnos()

}