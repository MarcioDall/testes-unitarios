package br.com.app.unity_test;

import java.util.List;

public class E4_Prateleira {

	private int numero;
	private List<E4_Item> itens;

	public E4_Prateleira(int numero, List<E4_Item> itens) {
		this.numero = numero;
		this.itens = itens;
	}

	public int getNumero() {
		return numero;
	}

	public List<E4_Item> getItens() {
		return itens;
	}
}