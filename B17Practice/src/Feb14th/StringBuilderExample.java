package Feb14th;

public class StringBuilderExample {
	
	public static void main(String args[]){  
	
		StringBuilder sb = new StringBuilder("Hello ");  
		sb.append("Java"); 
		System.out.println(sb);
		
		StringBuilder sb2 = new StringBuilder("Hello ");  
		sb2.insert(1,"Java");
		System.out.println(sb2);
		
		StringBuilder sb3 = new StringBuilder("Hello");  
		sb3.replace(1,3,"Java");  
		System.out.println(sb3);
		
		StringBuilder sb4 = new StringBuilder("Hello");  
		sb4.delete(1,3);  
		System.out.println(sb4);
		
		StringBuilder sb5 = new StringBuilder("Hello");  
		sb5.reverse();  
		System.out.println(sb5);
		
		StringBuilder sb6 = new StringBuilder();  
		System.out.println(sb6.capacity());  
		sb6.append("Hello");  
		System.out.println(sb6.capacity());  
		sb6.append("java is my favourite language");  
		System.out.println(sb6.capacity());
		
		StringBuilder sb7 = new StringBuilder();  
		System.out.println(sb7.capacity());  
		sb7.append("Hello");  
		System.out.println(sb7.capacity());  
		sb7.append("java is my favourite language");  
		System.out.println(sb7.capacity());  
		sb7.ensureCapacity(10);  
		System.out.println(sb7.capacity());  
		sb7.ensureCapacity(50);  
		System.out.println(sb7.capacity());
	}  
}
