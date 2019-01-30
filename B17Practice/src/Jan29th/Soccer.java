package Jan29th;

public class Soccer {
	
	private int n = 0;
	
	public void goal (int i) {
		n++;
		System.out.println("Player number " + i + " has scored a goal!");
	}
	
	public void score () {
		System.out.println("The current score is " + n + "-0");
	}

}
