package Feb14th;

import java.util.*;

public class MapExample5 {

	public static void main(String args[]){  
	
		Map<Integer,String> map = new HashMap<Integer,String>();          
		
		map.put(100, "Sang");    
		map.put(101, "Smith");    
		map.put(102, "Dong");    
		
		map.entrySet()  
		
		.stream()  
		
		.sorted(Map.Entry.comparingByValue())  
		
		.forEach(System.out::println);  	
	}  
}
