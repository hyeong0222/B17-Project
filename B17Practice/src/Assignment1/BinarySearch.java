package Assignment1;

public class BinarySearch {
	
	public static int binarySearch(int[] arr, int key) {
		int first = 0;
		int last = arr.length - 1;
		int mid = (first + last) / 2;
		
		while (first <= last) {
			if (arr[mid] < key) {
				first = mid + 1;
			}
			else if (arr[mid] > key) {
				last = mid - 1;
			}
			else {
				return mid;
			}
			
			mid = (first + last) / 2;
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		int[] arr = {10, 15, 20, 25, 30, 35, 40, 45, 50};
		int key = 45;
		binarySearch(arr, key);
		
	}

}
