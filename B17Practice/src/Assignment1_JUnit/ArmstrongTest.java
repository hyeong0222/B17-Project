package Assignment1_JUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Assignment1.Armstrong;

class ArmstrongTest {
	
	Armstrong armstrong = new Armstrong();

	@Test
	void test() {
		
		boolean expected = true;
		boolean actual = armstrong.armstrong(153);
		
		assertEquals(expected, actual);
	}

}
