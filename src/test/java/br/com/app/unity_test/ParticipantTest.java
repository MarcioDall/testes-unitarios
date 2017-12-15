package br.com.app.unity_test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.app.data.participant;

public class ParticipantTest {

	@Test
	public void Valid_set_name() {
		participant p1 = new participant();
		p1.setNome("Marcio");
		assertEquals("Marcio", p1.getNome());
	}

	@Test
	public void Valid_set_age() {
		participant p2 = new participant();
		p2.setIdade(31);
		assertEquals(31, p2.getIdade());
	}

	@Test
	public void Valid_set_last_name() {
		participant p3 = new participant();
		p3.setLastName("Dallelaste");
		assertEquals("Dallelaste", p3.getLastName());
	}

	@Test
	public void Valid_set_weight() {
		participant p4 = new participant();
		p4.setWeight(100);
		assertEquals(100, p4.getWeight());
	}
	
	@Test
	public void Valid_set_height() {
		participant p5 = new participant();
		p5.setAltura(186);
		assertEquals(186, p5.getAltura());
	}
}
