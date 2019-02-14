package Feb13th_JUnit;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.Test;

class Car {
	
	String brand, name;
	int topSpeed;
	
	public Car (String brand, String name, int topSpeed) {
		this.brand = brand;
		this.name = name;
		this.topSpeed = topSpeed;
	}
}

class HashSet5Test {

	@Test
	void test() {
		HashSet<Car> set = new HashSet<Car>();
		
		Car car1 = new Car("Mercedes Benz", "S650", 250);
		Car car2 = new Car("Audi", "R8", 330);
		Car car3 = new Car("BMW", "i8", 250);
		
		set.add(car1);
		set.add(car2);
		set.add(car3);
		
		String expected ="Mercedes Benz S650 250 Audi R8 330 BMW i8 250 ";
		String actual = "";
		
		for (Car car : set) {
			actual = actual + car.brand + " " + car.name + " " + car.topSpeed + " ";
		}
		
		assertEquals(expected, actual);
		
	}

}
