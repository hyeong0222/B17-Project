package Feb12th;

import java.util.*;

public class LinkedList1 {
	
	public static void main(String args[]){  
	
		LinkedList<String> linkedList = new LinkedList<String>();  
		
		linkedList.add("Ravi");  
		linkedList.add("Vijay");  
		linkedList.add("Ravi");  
		linkedList.add("Ajay");  
		    
		Iterator<String> itr = linkedList.iterator();  
		  
		while(itr.hasNext()){  
			System.out.println(itr.next());    
		}  	 
	}  

}
