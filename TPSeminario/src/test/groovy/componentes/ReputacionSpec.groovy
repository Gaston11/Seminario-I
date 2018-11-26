package componentes

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class ReputacionSpec extends Specification implements DomainUnitTest<Reputacion> {

    def setup() {
    }

    def cleanup() {
    }

	void creoReputacionYCantidadDeEstrellasEsCero(){
		def unaReputacion = new Reputacion()
		assertEquals(0, unaReputacion.CantidadDeEstrellas)
	}

}
