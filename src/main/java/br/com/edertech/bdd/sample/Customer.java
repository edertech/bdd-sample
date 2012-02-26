package br.com.edertech.bdd.sample;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Customer {
	private TrolleyShopping trolleyShopping;
	
	public TrolleyShopping getTrolleyShopping() {
		return trolleyShopping;
	}
	
	public void setTrolleyShopping(TrolleyShopping trolleyShopping) {
		this.trolleyShopping = trolleyShopping;
	}

	public void buy() {		
	}
	
	public BigDecimal orderOfPrice(){
		BigDecimal total = this.trolleyShopping.getTotalOrderOfPrice();
		
		if (total.compareTo(new BigDecimal("200.00")) >= 0 ) {
			// applying 10% off the total price
			double discountValue = total.doubleValue() * 0.9;
			return new BigDecimal(discountValue).setScale(2, RoundingMode.HALF_UP);
		} else {
			return total;
		}
	}
}

