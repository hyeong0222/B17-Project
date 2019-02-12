package threads;

public class TestJoinMethod extends Thread{  
	
	public void run(){  
		
		for (int i = 1; i <= 5; i++) {
			
			try{  
				Thread.sleep(500);  
			} catch(Exception e){
				System.out.println(e);
			}  
			
			System.out.println(i + " " + Thread.currentThread().getName());  
		}  
	}  
	
	public static void main(String args[]){  
		
		TestJoinMethod t1 = new TestJoinMethod(); 
		t1.setName("Dong");
		TestJoinMethod t2 = new TestJoinMethod(); 
		t2.setName("Sang");
		TestJoinMethod t3 = new TestJoinMethod();  
		t3.setName("Smith");
		
		t1.start();  
		
		try {  
			t1.join(1500);  
		} catch(Exception e) {
			System.out.println(e);
		}  
		
		t2.start();  
		t3.start();  
		
	}  
}  
