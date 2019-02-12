package Feb12th;

import java.util.*;

public class LinkedList3 {
	
	public static void main(String [] args) {  
		
		LinkedList<String> linkedList = new LinkedList<String>();  
		
		linkedList.add("Ravi");  
		linkedList.add("Vijay");  
		linkedList.add("Ajay");  
		linkedList.add("Anuj");  
		linkedList.add("Gaurav");  
		linkedList.add("Harsh");  
		linkedList.add("Virat");  
		linkedList.add("Gaurav");  
		linkedList.add("Harsh");  
		linkedList.add("Amit");  
         
		System.out.println("Initial list of elements: " + linkedList);    
		
		linkedList.remove("Vijay"); 
		System.out.println("After invoking remove(object) method: " + linkedList);   
		
		linkedList.remove(0);  
		System.out.println("After invoking remove(index) method: " + linkedList);   
            
		LinkedList<String> linkedList2 = new LinkedList<String>();  
		linkedList2.add("Ravi");  
		linkedList2.add("Hanumat");  
       
		linkedList.addAll(linkedList2);      
		System.out.println("Updated list : " + linkedList);   
       
		linkedList.removeAll(linkedList2);      
		System.out.println("After invoking removeAll() method: " + linkedList);   
            
		linkedList.removeFirst();      
		System.out.println("After invoking removeFirst() method: " + linkedList);  
            
		linkedList.removeLast();      
		System.out.println("After invoking removeLast() method: " + linkedList);  
		
		linkedList.removeFirstOccurrence("Gaurav");      
		System.out.println("After invoking removeFirstOccurrence() method: " + linkedList);  
        
		linkedList.removeLastOccurrence("Harsh");      
		System.out.println("After invoking removeLastOccurrence() method: " + linkedList);  

		linkedList.clear();      
		System.out.println("After invoking clear() method: " + linkedList);   
     
	}  
}
