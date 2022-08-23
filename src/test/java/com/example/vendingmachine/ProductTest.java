package com.example.vendingmachine;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class ProductTest {

	@Test
	void colaCostsOneDollar() {
		assertThat(Product.COLA.getPrice()).isEqualTo(1.00f);
	}
	
}