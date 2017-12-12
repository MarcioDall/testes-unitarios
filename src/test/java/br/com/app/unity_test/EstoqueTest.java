package br.com.app.unity_test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import br.com.app.estoque.Item;
import br.com.app.estoque.Prateleira;

public class EstoqueTest {
//	@Test
//	public void insere_2_itens_deixa_2_slots_vazio() {
//		List<Item> itens = new ArrayList<Item>();
//		itens.add(new Item("Prato"));
//		itens.add(new Item("Garfo"));
//		itens.add(new Item("vazio"));
//		itens.add(new Item("vazio"));
//		Prateleira prateleira = new Prateleira(1, itens);
//
//		for (Item item : itens) {
//			System.out.println(item.getNome());
//		}
//
//	}

	@Test
	public void insere_1_itens_deixa_3_slots_vazio() {
		List<Item> itens = new ArrayList<Item>();
		itens.add(new Item("Prato"));
		itens.add(new Item("vazio"));
		itens.add(new Item("vazio"));
		itens.add(new Item("vazio"));
		Prateleira prateleira = new Prateleira(1, itens);

		
		for (Item item : itens) {
			System.out.println(item.getNome());
		
			
 		}
		
		
	}
	
	
}
