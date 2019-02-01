package Jan31st;

public class operation2 {
	
	int data = 50;
	
	/**
	 * This method would increment the data value by 100
	 * @param op
	 */
	void change (operation2 op) {
		op.data = op.data + 100;
	}
	
	/**
	 * This is the main method 
	 * This method would show the value of data before and after implementing change method.
	 * @param args
	 */
	public static void main (String[] args) {
		operation2 op = new operation2();
		
		System.out.println("before change " + op.data);
		op.change(op);
		System.out.println("after change " + op.data);
	}
	
}
