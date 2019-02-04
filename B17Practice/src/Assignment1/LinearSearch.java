package Assignment1;

public class LinearSearch {
	
	public static int linearSearch (int[] arr, int key) {
		int n = arr.length;
		
		for (int i = 0; i < n; i++) {
			if (arr[i] == key) {
				return i;
			}
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		int[] arr = {3, 60, 35, 2, 45, 320, 5};
		int key = 45;
		
		System.out.println(linearSearch(arr, key));
	}

}
