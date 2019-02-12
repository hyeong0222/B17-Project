package Assignment1_JUnit;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import Assignment1.BubbleSort;

class BubbleSortTest {

	BubbleSort bubbleSort = new BubbleSort();
	
	@Test
	void test() {
		
		int[] arr = {3, 60, 35, 2, 45, 320, 5};
		int[] expected = {2, 3, 5, 35, 45, 60, 320};
		int[] actual = bubbleSort.bubbleSort(arr);

		assertArrayEquals(expected, actual);
		
	}

}
