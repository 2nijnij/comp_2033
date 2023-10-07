package ca1.task4;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CarAndProcessingTest {
	private Car[] cars;
	
	@BeforeEach
	void setUp() {
        cars = new Car[] {
        	new Car("Honda", "Civic", "Red"),
            new Car("Holden", "Civic", "Red"),
            new Car("Jeep", "Wrangler", "Blue"),
            new Car("Jeep", "Wrangler", "Green"),
            new Car("Holden", "Falcon", "Yellow"),
            new Car("Honda", "Civic", "Blue"),
            new Car("Honda", "Falcon", "Blue"),
            new Car("Honda", "Civic", "Purple")
	};

 }
	@Test
	void testCarEquals() {
        Car car1 = new Car("Toyota", "Camry", "Blue");
        Car car2 = new Car("Toyota", "Camry", "Blue");
        Car car3 = new Car("Honda", "Civic", "Red");

        assertTrue(car1.equals(car2), "car1 is equal to car2");
        assertFalse(car1.equals(car3), "car1 is not equal to car3");

	}
}
