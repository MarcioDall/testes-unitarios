package br.com.app.unity_test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import junit.framework.Assert;

public class E4_PrateleiraTest {
@Test
	public void insere_2_itens_deixa_2_slots_vazio() {
		List<E4_Item> itens = new ArrayList<E4_Item>();
		itens.add(new E4_Item("Prato"));
		itens.add(new E4_Item("Garfo"));
		itens.add(new E4_Item("vazio"));
		itens.add(new E4_Item("vazio"));
		E4_Prateleira prateleira = new E4_Prateleira(1,itens);
		
	for (E4_Item item : itens) {
		System.out.println(item.getNome());
	}
	
	}
	
}
