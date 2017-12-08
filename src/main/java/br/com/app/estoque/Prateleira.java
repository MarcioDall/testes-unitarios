package br.com.app.estoque;

import java.util.List;

public class Prateleira {

	private int numero;
	private List<Item> itens;

	public Prateleira(int numero, List<Item> itens) {
		this.numero = numero;
		this.itens = itens;
	}

	public int getNumero() {
		return numero;
	}

	public List<Item> getItens() {
		return itens;
	}
}