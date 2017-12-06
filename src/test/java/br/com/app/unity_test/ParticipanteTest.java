package br.com.app.unity_test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ParticipanteTest {

	@Test
	public void testSetNome() {
		Participante p1 = new Participante();
		p1.setNome("Marcio");
		assertEquals("Marcio", p1.getNome());
	}

	@Test
	public void testSetIdade() {
		Participante p2 = new Participante();
		p2.setIdade(31);
		assertEquals(31, p2.getIdade());
	}

	@Test
	public void testSetLastName() {
		Participante p3 = new Participante();
		p3.setLastName("Dallelaste");
		assertEquals("Dallelaste", p3.getLastName());
	}

	@Test
	public void testWeight() {
		Participante p4 = new Participante();

		p4.setWeight(100);

		assertEquals(100, p4.getWeight());
	}
}
