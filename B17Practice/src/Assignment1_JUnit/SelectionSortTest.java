package Assignment1_JUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Assignment1.SelectionSort;

class SelectionSortTest {
	
	SelectionSort selectionSort = new SelectionSort();

	@Test
	void test() {
		
		int[] arr = {3, 60, 35, 2, 45, 320, 5};
		int[] expected = {2, 3, 5, 35, 45, 60, 320};
		int[] actual = selectionSort.selectionSort(arr);
		
		assertArrayEquals(expected, actual);

	}

}
