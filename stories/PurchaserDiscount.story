import br.com.edertech.bdd.sample.Customer
import br.com.edertech.bdd.sample.TrolleyShopping
import br.com.edertech.bdd.sample.Item

narrative "Buying a electronic music CD with discount", {
	as_a "customer"
	i_want "a discount when I buy a CD"
	so_that "i possibly i'd buy another CD again"
}
 
before_each "inicialize a customer", {
	given "a customer", {
		customer = new Customer()
		trolleyShopping = new TrolleyShopping()
	}	
}

scenario "customer with \$200 or more" , {
	when "they have \$200 or more in their purchase", {
		trolleyShopping.addItem(new Item("Kraftwerk – Computerwelt", 1981, 201.00))
		customer.trolleyShopping = trolleyShopping
		customer.buy()
	}
	then "they should receive 10% off the total price", {
		customer.orderOfPrice().shouldBe 180.9 
	}
}

scenario "customer with less than \$200", {
	when "they have less than \$200 in their purchase", {
		trolleyShopping.addItem(new Item("Altern 8 - Frequency single", 1991, 199.00))
		customer.trolleyShopping = trolleyShopping
		customer.buy()
	}
	then "they should not receive any discounts", {
		customer.orderOfPrice().shouldBe 199.00
	}
}

