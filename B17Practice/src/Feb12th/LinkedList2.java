package Feb12th;

import java.util.*;

public class LinkedList2 {
	
	public static void main(String args[]){  

		LinkedList<String> linkedList = new LinkedList<String>();  
		
		System.out.println("Initial list of elements: " + linkedList);
		
		linkedList.add("Ravi");
		linkedList.add("Vijay");  
		linkedList.add("Ajay");  
		
		System.out.println("After invoking add(E e) method: " + linkedList);  
		           
		linkedList.add(1, "Gaurav");            
		System.out.println("After invoking add(int index, E element) method: " + linkedList);  
		
		
		LinkedList<String> linkedList2 = new LinkedList<String>();  
		
		linkedList2.add("Sonoo");  
		linkedList2.add("Hanumat");  
		linkedList.addAll(linkedList2);  
		           
		System.out.println("After invoking addAll(Collection<? extends E> c) method: " + linkedList2);  
		           
		
		LinkedList<String> linkedList3 = new LinkedList<String>();  
		           
		linkedList3.add("John");  
		linkedList3.add("Rahul");  
		         
		linkedList.addAll(1, linkedList3);  
		           
		System.out.println("After invoking addAll(int index, Collection<? extends E> c) method: " + linkedList);  
		           
		linkedList.addFirst("Lokesh");  
		           
		System.out.println("After invoking addFirst(E e) method: " + linkedList);  
		           
		linkedList.addLast("Harsh");  
		          
		System.out.println("After invoking addLast(E e) method: " + linkedList);  
		             	 
	}  

}
