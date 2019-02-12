package Feb12th;

import java.util.*;

public class HashSet4 {
	
	public static void main(String args[]){  
	
		ArrayList<String> list = new ArrayList<String>();  
		           
		list.add("a");  
		list.add("b");  
		list.add("c");  
		
		HashSet<String> set = new HashSet(list);  		           
		set.add("d");  
		          
		Iterator<String> i = set.iterator();  
		           
		while(i.hasNext()) {  
			System.out.println(i.next());    
		}  
		 
	}  
}
