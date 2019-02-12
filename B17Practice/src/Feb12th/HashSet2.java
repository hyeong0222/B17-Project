package Feb12th;

import java.util.*;

public class HashSet2 {
	
	public static void main(String args[]){  
		
		HashSet<String> set = new HashSet<String>();  
		
		set.add("a");  
		set.add("b");  
		set.add("a");  
		set.add("c");  
		  
		Iterator<String> itr = set.iterator();  
		
		while(itr.hasNext()) {  
			System.out.println(itr.next());  
		}  	
	}  

}
