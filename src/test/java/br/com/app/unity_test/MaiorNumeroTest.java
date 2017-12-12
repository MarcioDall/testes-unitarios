package br.com.app.unity_test;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.app.maiornumero.MaiorNumero;

public class MaiorNumeroTest {

	@Test
	public void comparaNumero() {
		MaiorNumero m1 = new MaiorNumero();
		m1.setNumero1(11);
		m1.setNumero2(2);
		assertEquals(11, m1.compareNumero());
	}
}
