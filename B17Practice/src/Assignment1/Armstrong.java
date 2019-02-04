package Assignment1;

public class Armstrong {
	
	public static boolean armstrong (int n) {
		int ans = 0;
		int temp = n;
		int remainder;
		
		while (n > 0) {
			remainder = n % 10;
			n = n / 10;
			ans += (remainder * remainder * remainder);
		}
		
		if (temp == ans)
			return true;
		else return false;
	}
	
	public static void main(String[] args) {
		
		if (armstrong(153))
			System.out.println("This is an armstrong number.");
		else System.out.println("This is not an armstrong number.");
	}
}
