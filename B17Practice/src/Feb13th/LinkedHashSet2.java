package Feb13th;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet2 {
	 
	public static void main(String args[]){  
	
		LinkedHashSet<String> set = new LinkedHashSet<String>();  
		
		set.add("One");  
		set.add("Two");  
		set.add("Three");  
		set.add("Four");  
		  
		Iterator<String> itr = set.iterator();  
		  
		while(itr.hasNext()){  
			
			System.out.println(itr.next());  
		}	
	}  
}
