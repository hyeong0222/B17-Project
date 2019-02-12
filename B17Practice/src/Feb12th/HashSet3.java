package Feb12th;

import java.util.*;

public class HashSet3 {
 
	public static void main(String args[]){  
		
		HashSet<String> set = new HashSet<String>();  
		
		set.add("a");  
		set.add("b");  
		set.add("c");  
		set.add("d");  
		
		System.out.println("An initial list of elements: " + set);  

		set.remove("a");  
		System.out.println("After invoking remove(object) method: " + set);  
		           
		HashSet<String> set1 = new HashSet<String>();  
		set1.add("e");  		
		set1.add("f");  		
		set.addAll(set1);  
		           
		System.out.println("Updated List: " + set);    
		           
		set.removeAll(set1);  
		System.out.println("After invoking removeAll() method: " + set);  
		           
		set.removeIf(str->str.contains("Vijay"));    
		System.out.println("After invoking removeIf() method: " + set);  
		           
		set.clear();             
		System.out.println("After invoking clear() method: " + set);  
		 
	}   
}
