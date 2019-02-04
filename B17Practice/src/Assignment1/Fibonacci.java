package Assignment1;

public class Fibonacci {
	
	/*
	 * Algorithm: f(n) = f(n - 1) + f(n - 2)
	 * 				f(n + 1) = f(n) + f(n - 1)
	 * 
	 * Dynamic Programming - Bottom-up 
	 */
	
	public static int fib (int n) {
		
		int prev = 0;
		int curr = 1;
		
		for (int i = 2; i <= n; i++) {
			int next = prev + curr;
			prev = curr;
			curr = next;
		}
		
		return curr;
	}
	
	public static void main(String[] args) {
		
		System.out.println(fib(5));
	}
	
}
