package Jan30th;

public class GST extends IncomeTax {
	
	public int calculateTax() {
		
		int tax =0;
		
		if(salary < 500000) 
			tax = salary / 10;
		
		if(salary > 500000 && salary <= 1000000) 
			tax = (int) (salary * 0.2);
		
		if(salary > 1000000 && salary < 5000000)
			tax = (int) (salary * 0.3);
		
		return tax;
		
	}

}
