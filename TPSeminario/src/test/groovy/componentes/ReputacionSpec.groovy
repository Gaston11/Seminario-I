package componentes

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class ReputacionSpec extends Specification implements DomainUnitTest<Reputacion> {

    def setup() {
    }

    def cleanup() {
    }

    //void "test something"() {
      //  expect:"fix me"
        //    true == false
    //}

	void creoReputacionYCantidadDeEstrellasEsCero(){
		def unaReputacion = new Reputacion()
		assertEquals(0, Reputacion.CantidadDeEstrellas)	
	}
}
