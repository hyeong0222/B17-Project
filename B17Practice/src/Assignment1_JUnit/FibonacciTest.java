package Assignment1_JUnit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import Assignment1.Fibonacci;

class FibonacciTest {
	
	Fibonacci fib = new Fibonacci();

	@Test
	void test() {
		int expected1 = 5;
		int actual1 = fib.fib(5);
		
		assertEquals(expected1, actual1);
		
		
		int expected2 = 8;
		int actual2 = fib.fib(6);
		
		assertEquals(expected2, actual2); 
	}

}
