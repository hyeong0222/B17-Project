package Assignment1;

import java.util.Arrays;

public class InsertionSort {
	
	public static int[] insertionSort(int[] arr) {
		int n = arr.length;
		
		for (int i = 1; i < n; i++) {
			int key = arr[i];
			int j = i;
			
			while (j > 0 && arr[j - 1] > key) {
				arr[j] = arr[j - 1];
				j--;
			}
			arr[j] = key;
		}
		
		return arr;
	}
	
	public static void main(String[] args) {
		int[] arr = {3, 60, 35, 2, 45, 320, 5};
		insertionSort(arr);
	}
	
	
}
