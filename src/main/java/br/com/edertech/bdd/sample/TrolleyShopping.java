package br.com.edertech.bdd.sample;

import java.util.ArrayList;
import java.math.BigDecimal;

public class TrolleyShopping {
	
	private ArrayList<Item> items = new ArrayList<Item>();
	
	public void addItem(Item item) {
		this.items.add(item);		
	}
	
	public BigDecimal getTotalOrderOfPrice() {
		BigDecimal total = new BigDecimal(0);
		
		for(Item item : this.items){
			total = total.add(item.getPrice());
		}
		
		return total;
	}	
}