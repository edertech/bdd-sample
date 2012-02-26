package br.com.edertech.bdd.sample;

import java.math.BigDecimal;

public class Item{
	private BigDecimal price;
	
	public Item(String name, Integer year, BigDecimal price) {
		this.price = price;
	}
	
	public BigDecimal getPrice(){
		return this.price;
	}	
}