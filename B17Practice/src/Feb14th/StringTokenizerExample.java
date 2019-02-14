package Feb14th;

import java.util.StringTokenizer;

public class StringTokenizerExample {
	 
	public static void main(String args[]){  
	
		StringTokenizer st = new StringTokenizer("My name is Sang", " ");  
		
		while (st.hasMoreTokens()) {  
			System.out.println(st.nextToken());   
		}  	
	} 
}
