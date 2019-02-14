package Feb14th;

public class StringBufferExample {
	
	public static void main(String args[]){  
	
		StringBuffer sb = new StringBuffer("Hello ");  
		sb.append("Java");  
		System.out.println(sb);
		
		StringBuffer sb2 = new StringBuffer("Hello ");  
		sb2.insert(1,"Java");  
		System.out.println(sb2);
		
		StringBuffer sb3 = new StringBuffer("Hello");  
		sb3.replace(1,3,"Java");  
		System.out.println(sb3);
		
		StringBuffer sb4 = new StringBuffer("Hello");  
		sb4.delete(1,3);  
		System.out.println(sb4);
		
		StringBuffer sb5 = new StringBuffer("Hello");  
		sb5.reverse();  
		System.out.println(sb5);
		
		StringBuffer sb6 = new StringBuffer();  
		System.out.println(sb6.capacity());  
		sb6.append("Hello");  
		System.out.println(sb6.capacity());  
		sb6.append("java is my favourite language");  
		System.out.println(sb6.capacity());
	}  
}
