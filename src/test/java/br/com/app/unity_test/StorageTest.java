package br.com.app.unity_test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import br.com.app.Storage.Item;
import br.com.app.Storage.Shelf;

public class StorageTest {
	@Test
	public void insert_new_item() {
		
		String plate = "Plate";
		
		List<Item> itens = new ArrayList<Item>();
		itens.add(new Item(plate));
		Shelf prateleira = new Shelf(1, itens);

		
		for (Item item : itens) {
			assertEquals(plate, (item.getName()));
		
			
 		}
		
		
	}
	
	
}
