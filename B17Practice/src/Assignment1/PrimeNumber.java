package Assignment1;

public class PrimeNumber {
	
	/*
	 * 
	 */
	
	public static void prime (int n) {
		
		int num = 2;
		int count = 0;
		
		while (count < n) {
			if (isPrime(num)) {
				System.out.print(num + " ");
				count++;
			}
			
			num++;
			
		}
		
	}
	
	public static boolean isPrime (int n) {
		
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		prime(5);
	}
}
