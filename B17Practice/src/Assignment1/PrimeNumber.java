package Assignment1;

public class PrimeNumber {
	
	/*
	 * 
	 */
	
	public static String prime (int n) {
		
		int num = 2;
		int count = 0;
		String ans = "";
		
		while (count < n) {
			if (isPrime(num)) {
				ans += num + " ";
//				System.out.print(num + " ");
				count++;
			}
			
			num++;
		}
		
		return ans;
	}
	
	public static boolean isPrime (int n) {
		
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		System.out.println(prime(5));
	}
}
