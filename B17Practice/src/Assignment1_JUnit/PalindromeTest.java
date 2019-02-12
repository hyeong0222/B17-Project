package Assignment1_JUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Assignment1.Palindrome;

class PalindromeTest {
	
	Palindrome palindrome = new Palindrome();

	@Test
	void test() {
		boolean actual = palindrome.palindrome(545);
		assertEquals(true, actual);
		
		boolean actual2 = palindrome.palindrome(546);
		assertEquals(false, actual2);
		
	}

}
