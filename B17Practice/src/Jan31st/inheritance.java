package Jan31st;

public class inheritance {
	
	
	float salary = 4000;

	public static void main(String[] args) {
		Programmer p = new Programmer();
		System.out.println("Programmer salary is: " + p.salary);
		System.out.println("Bonus of programmer is: " + p.bonus);
	}
}
	
class Programmer extends inheritance {	
		
	int bonus = 4000;
	
}

