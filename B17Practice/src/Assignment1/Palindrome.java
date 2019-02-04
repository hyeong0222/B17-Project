package Assignment1;

public class Palindrome {
	
	public static boolean palindrome(int n) {
		String original = Integer.toString(n);
		String palindrome = "";
		
		int length = original.length();
		
		for (int i = length - 1; i >= 0; i--) {
			palindrome += original.charAt(i);
		}
		
		if (original.equals(palindrome))
			return true;
		else return false;
	}
	
	public static void main (String[] args) {
		if (palindrome(546)) {
			System.out.println("This number is a palindrome.");
		}
		else System.out.println("This number is not a palindrome.");
	}

}
