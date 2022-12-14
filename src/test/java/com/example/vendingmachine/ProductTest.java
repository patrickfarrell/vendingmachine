package com.example.vendingmachine;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class ProductTest {

	@Test
	void colaCostsOneDollar() {
		assertThat(Product.COLA.getPrice()).isEqualTo(1.00d);
	}
	
	@Test
	void candyCostsSixtyFiveCents() {
		assertThat(Product.CANDY.getPrice()).isEqualTo(0.65d);
	}
	
	@Test
	void chipsCostsFiftyCents() {
		assertThat(Product.CHIPS.getPrice()).isEqualTo(0.50d);
	}
}
