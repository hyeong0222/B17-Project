package Feb1st;

class Animal{  
	
	void eat(){System.out.println("animal is eating...");}  
}  
	  
class DynamicBinding extends Animal{  
	 
	void eat(){System.out.println("dog is eating...");}    
	
	public static void main(String args[]){  
		Animal a = new DynamicBinding();  
		a.eat();  
	}  
}
