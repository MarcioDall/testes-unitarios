package br.com.app.unity_test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.app.data.participant;

public class participantTest {

	@Test
	public void Valida_setar_nome() {
		participant p1 = new participant();
		p1.setNome("Marcio");
		assertEquals("Marcio", p1.getNome());
	}

	@Test
	public void Valida_setar_idade() {
		participant p2 = new participant();
		p2.setIdade(31);
		assertEquals(31, p2.getIdade());
	}

	@Test
	public void Valida_setar_sobrenome() {
		participant p3 = new participant();
		p3.setLastName("Dallelaste");
		assertEquals("Dallelaste", p3.getLastName());
	}

	@Test
	public void Valida_setar_peso() {
		participant p4 = new participant();
		p4.setWeight(100);
		assertEquals(100, p4.getWeight());
	}
	
	@Test
	public void Valida_setar_altura() {
		participant p5 = new participant();
		p5.setAltura(186);
		assertEquals(186, p5.getAltura());
	}
}
