package Assignment1_JUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Assignment1.Factorial;

class FactorialTest {
	
	Factorial factorial = new Factorial();

	@Test
	void test() {
		int expected = 120;
		int actual = factorial.factorial(5);
		
		assertEquals(expected, actual);
	}

}
