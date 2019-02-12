package Assignment1_JUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Assignment1.PrimeNumber;

class PrimeNumberTest {
	
	PrimeNumber primeNumber = new PrimeNumber();

	@Test
	void test() {
		
		String expected = "2 3 5 7 11 ";
		String actual = primeNumber.prime(5);
		
		System.out.println(actual);
		
		assertEquals(expected, actual);

	}

}
