package Assignment1_JUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Assignment1.LinearSearch;

class LinearSearchTest {
	
	LinearSearch linearSearch = new LinearSearch();

	@Test
	void test() {
		
		int[] arr = {3, 60, 35, 2, 45, 320, 5};
		int expected = 4;
		int actual = linearSearch.linearSearch(arr, 45);
		
		assertEquals(expected, actual);

	}

}
