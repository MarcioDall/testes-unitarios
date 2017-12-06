package br.com.app.unity_test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import junit.framework.Assert;

public class PrateleiraTest {
@Test
	public void insere_2_itens_deixa_2_slots_vazio() {
		List<Item> itens = new ArrayList<Item>();
		itens.add(new Item("Prato"));
		itens.add(new Item("Garfo"));
		itens.add(new Item("vazio"));
		itens.add(new Item("vazio"));
		Prateleira prateleira = new Prateleira(1,itens);
		
	for (Item item : itens) {
		System.out.println(item.getNome());
	}
	
	}
	
}
