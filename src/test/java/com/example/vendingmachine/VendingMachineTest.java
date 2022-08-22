package com.example.vendingmachine;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * This class ensures that the Vending Machine implementation is working properly
 * according to the stated business or technical requirements
 * 
 * 
 * Approach:
 * 1. Write a failing test
 * 2. Implement just enough code to make the test pass
 * 3. Commit our code
 * 4. Refactor
 * 5. Commit our code
 * 
 * @author Patrick Farrell
 */
class VendingMachineTest {
	
	private VendingMachine subject;
	
	@BeforeEach
	void initialize() {
		subject = new VendingMachine();
	}
	
	@Test
	void vendingMachineDefaultConstructorReturnsInstance() {
		assertThat(subject).isNotNull();
	}
	
	
	@Test
	void displayReadsInsertCoinWhenNoCoinsInserted() {
		assertThat(subject.getDisplayText()).isEqualTo("INSERT COIN");
	}
	
	@Test
	void displayReadsTwentyFiveCentsWhenOneQuarterInserted() {
		insertQuarter();
		assertThat(subject.getDisplayText()).isEqualTo("$0.25");
	}

	@Test
	void displayReadsTenCentsWhenOneDimeInserted() {
		insertDime();
		assertThat(subject.getDisplayText()).isEqualTo("$0.10");
	}
	
	@Test
	void displayReadsFiveCentsWhenOneNickelInserted() {
		insertNickel();
		assertThat(subject.getDisplayText()).isEqualTo("$0.05");
	}
	
	@Test
	void displayReadsFortyCentsWhenOneNickeOneDimeAndOneQuarterlInserted() {
		insertQuarter();
		insertDime();
		insertNickel();
		assertThat(subject.getDisplayText()).isEqualTo("$0.40");
	}
	
	private void insertQuarter() {
		subject.insertCoin(0.25f);
	}
	
	private void insertDime() {
		subject.insertCoin(0.10f);
	}
	
	private void insertNickel() {
		subject.insertCoin(0.05f);
	}
}