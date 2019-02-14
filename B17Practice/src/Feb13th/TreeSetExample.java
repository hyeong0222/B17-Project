package Feb13th;

import java.util.Set;
import java.util.TreeSet;

class Book2 implements Comparable<Book2> {  

	int id;  
	String name,author,publisher;  
	int quantity;  

	public Book2 (int id, String name, String author, String publisher, int quantity) {  
    
		this.id = id;  
		this.name = name;  
		this.author = author;  
		this.publisher = publisher;  
		this.quantity = quantity;  

	}
	

	public int compareTo(Book2 b) {  
		
		if (id > b.id)
			return 1;  
		else if (id < b.id) {  
			return -1;  
		} 
		else return 0;  

	}  
}

public class TreeSetExample {  

	public static void main(String[] args) {  
    
		Set<Book2> set = new TreeSet<Book2>();  

		Book2 b1 = new Book2(121, "Let us C", "Yashwant Kanetkar", "BPB", 8);  
		Book2 b2 = new Book2(233, "Operating System", "Galvin", "Wiley", 6);  
		Book2 b3 = new Book2(101, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);  

		set.add(b1);  
		set.add(b2);  
		set.add(b3);  

		for(Book2 b : set){  
			System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);  
		}  
	}  
}
