package Feb5th;

public class ExceptionHandling {
	
	public static void main(String[] args) {
		
		try {
			int a = 10/0;
		}
		catch (Exception exceptionObject) {
			exceptionObject.printStackTrace();
		}
		
		System.out.println("Code after exception: ");
		
		
		try {
			int data = 100/0;
		}
		catch (ArithmeticException e) {
			System.out.println(e);
		}
		
		System.out.println("Code after exception: ");
		
		
		try {
			String s = null;
			System.out.println(s.length());
		}
		catch (NullPointerException e) {
			System.out.println(e);
		}
		System.out.println("Code after exception: ");

		
		try {
			int a[] = new int[5];
			a[10] = 50;
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		System.out.println("Code after exception: ");
		
		
		try{  
		
			try {  
			    int b =39/0;  
			}
			catch (ArithmeticException e) {
				System.out.println(e);
			}     
			    
			try {  
				int a[]=new int[5];  
			    a[5]=4;  
			}
			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}  
			     
			System.out.println("other statement:");  
			  
		}
		
		catch(Exception e){
			System.out.println("handeled");
		}
		
		  
		try {  
			int data = 25/5;     
			System.out.println(data);  	  
		}  	 
		catch (NullPointerException e) {
			System.out.println(e);
		}  	  
		finally {
			System.out.println("finally block is always executed");
		}
			  		
		
		try {     
			int data = 25/0;     
			System.out.println(data);  	  
		}  	  
		catch (NullPointerException e) {
			System.out.println(e);
		}  	  
		finally {
			System.out.println("finally block is always executed");
		} 
		
		  
		try {  
			int data = 25/0;     
			System.out.println(data);  	  
		}  	 
		catch (ArithmeticException e) {
			System.out.println(e);
		}  
		finally {
			System.out.println("finally block is always executed");	
		}  
	}
}
