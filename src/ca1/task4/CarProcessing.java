package ca1.task4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class CarProcessing {
	
	public static void main(String[] args) {
		
		// Create an instance of a CarProcessing class
		CarProcessing cp = new CarProcessing();
		
		// Create an array
		Car[] cars = { 
				new Car("Honda", "Civic", "Red"),
				new Car("Holden", "Civic", "Red"),
				new Car("Jeep", "Wrangler", "Blue"),
				new Car("Jeep", "Wrangler", "Green"),
				new Car("Holden", "Falcon", "Yellow"),
				new Car("Honda", "Civic", "Blue"),
				new Car("Honda", "Falcon", "Blue"),
				new Car("Honda", "Civic", "Purple")
		};
		
		// Call the removeDuplicate method
		Car[] noDuplicates = cp.removeDuplicates(cars);
		
		// To print the unique cars
		for(Car c : noDuplicates ) {
			System.out.println(c);
		}
	}
	
	// Method to remove duplicates based on model and color
    public Car[] removeDuplicates(Car[] inputArray) {
        // Create a set to store unique car identifiers
    	Set<String> carSet = new HashSet<>();
        
    	// Create a list to store unique cars
    	List<Car> uniqueCars = new ArrayList<>();
    	
    	// Loop for the input array of cars
        for (Car car : inputArray) {
            // Create a unique identifier based on model and color
        	String identifier = car.getModel() + "-" + car.getColor();
        	
        	// Check if the identifier is added to the set
            if (carSet.add(identifier)) {
                uniqueCars.add(car);
            }
        }
        
        // Convert the List of unique cars back to an array
        return uniqueCars.toArray(new Car[0]);
    }
}
