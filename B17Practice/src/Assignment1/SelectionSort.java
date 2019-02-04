package Assignment1;

import java.util.Arrays;

public class SelectionSort {
	
	public static void selectionSort (int[] arr) {
		
		int n = arr.length;
		
		for (int i = 0; i < n - 1; i++) {
			int index = i;
			
			for (int j = i + 1; j < n; j++) {
				if (arr[index] > arr[j]) {
					index = j;
				}
				
			}
			
			int temp = arr[index];
			arr[index] = arr[i];
			arr[i] = temp;
		}
		
		System.out.println(Arrays.toString(arr));
	}
	
	public static void main(String[] args) {
		int[] arr = {3, 60, 35, 2, 45, 320, 5};
		selectionSort(arr);
	}

}