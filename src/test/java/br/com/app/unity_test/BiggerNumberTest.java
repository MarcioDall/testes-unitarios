package br.com.app.unity_test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.app.biggerNumber.BiggerNumber;

public class BiggerNumberTest {

	@Test
	public void compareNumber() {
		BiggerNumber m1 = new BiggerNumber();
		m1.setNumberOne(11);
		m1.setNumberTwo(2);
		assertEquals(11, m1.compareNumber());
	}
}
