package Feb13th;

import java.util.*;

class Book4 {    

	int id;    
	String name, author, publisher;    
	int quantity;    

	public Book4(int id, String name, String author, String publisher, int quantity) {    
		
		this.id = id;    
		this.name = name;    
		this.author = author;    
		this.publisher = publisher;    
		this.quantity = quantity;    
	}    
}

public class ArrayDequeExample {    
	
	public static void main(String[] args) {    
		
		Deque<Book4> set = new ArrayDeque<Book4>();        
		
		Book4 b1 = new Book4(121, "Let us C", "Yashwant Kanetkar", "BPB", 8);  
		Book4 b2 = new Book4(233, "Operating System", "Galvin", "Wiley", 6);  
		Book4 b3 = new Book4(101, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);  
		
		set.add(b1);    
		set.add(b2);    
		set.add(b3);    
    
		for(Book4 b : set){    
		
			System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);     
		}    
	}    
}    
