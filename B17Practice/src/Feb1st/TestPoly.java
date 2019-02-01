package Feb1st;

public class TestPoly {
	
	public static void main(String[] args) {
		Father mfather;
		mfather = new Son(); //object is created at the runtime, so the son's eat method is called
		mfather.eat();
	}

}
