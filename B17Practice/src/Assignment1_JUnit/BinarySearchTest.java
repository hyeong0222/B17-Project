package Assignment1_JUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Assignment1.BinarySearch;

class BinarySearchTest {
	
	BinarySearch binarySearch = new BinarySearch();

	@Test
	void test() {
		
		int[] arr = {10, 15, 20, 25, 30, 35, 40, 45, 50};
		int expected = 7;
		int actual = binarySearch.binarySearch(arr, 45);
		
		assertEquals(expected, actual);
	}

}
