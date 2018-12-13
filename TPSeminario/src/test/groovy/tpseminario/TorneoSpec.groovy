package tpseminario

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class TorneoSpec extends Specification implements DomainUnitTest<Torneo> {

    def setup() {
    }

    def cleanup() {
    }

    //void "test something"() {
      //  expect:"fix me"
        //    true == false
    //}

    void creoUnTorneoConCuatroEquipos(){
    	alumno = Alumno()
    	deporte = Deporte("ajedrez", 4, alumno)
    	
    	torneo = Torneo(deporte, alumno)

    	assertEquals(torneo.cantidadDeEquipos, 5)

    }
}
