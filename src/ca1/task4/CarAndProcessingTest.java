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
	
}
