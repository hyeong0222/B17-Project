package Feb14th;

import java.util.*;

public class MapExample1 {

	public static void main(String[] args) {  

		Map map = new HashMap();  
	    
		
		map.put(1,"Sang");  
	    map.put(5,"Smith");  
	    map.put(2,"Dong");  
	    map.put(6,"Ziu");  
	    
	    
	    Set set = map.entrySet();//Converting to Set so that we can traverse  
	    Iterator itr = set.iterator();  
	    
	    while(itr.hasNext()){    
	        Map.Entry entry = (Map.Entry)itr.next();  
	        System.out.println(entry.getKey() + " " + entry.getValue());  
	    }  
	}  
}
