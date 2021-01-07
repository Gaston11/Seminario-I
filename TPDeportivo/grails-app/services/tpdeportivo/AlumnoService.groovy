
package tpdeportivo

import grails.gorm.services.Service

@Service(Alumno)
abstract class AlumnoService implements IAlumnoService{


	void generarAlumnos(){
		Alumno alumno = new Alumno()
		alumno.nombre = "Gaston Amurrio"
		alumno.fechaNacimiento = new Date(0)
		alumno.telefono = "11223344"

		alumno.save()
	}

}