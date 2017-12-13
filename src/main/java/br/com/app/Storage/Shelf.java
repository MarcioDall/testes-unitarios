package br.com.app.Storage;

import java.util.List;

public class Shelf {

	private int number;
	private List<Item> itens;

	public Shelf(int number, List<Item> itens) {
		this.number = number;
		this.itens = itens;
	}

	public int getnumber() {
		return number;
	}

	public List<Item> getItens() {
		return itens;
	}
}