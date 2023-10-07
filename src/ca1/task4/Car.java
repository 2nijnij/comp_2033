package ca1.task4;

import java.util.Objects;

public class Car {
	private String make;
	private String model;
	private String color;
	
	// Constructor
	public Car(String make, String model, String color) {
		
		this.make = make;
		this.model = model;
		this.color = color;
	}
	
	// Equals method for comparing two car objects based on make, model and color
	@Override
	public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(make, car.make) &&
               Objects.equals(model, car.model) &&
               Objects.equals(color, car.color);
	}
	
	// Method to generate the hash code
    @Override
    public int hashCode() {
        return Objects.hash(make, model, color);
    }
    
    // Method to provide a string representation
    @Override
    public String toString() {
        return make + ", " + model + ", " + color;
    }

    // Getter method to retrieve the model of the car
    public String getModel() {
        return model;
    }
    
    // Getter method to retrieve the color of the car
    public String getColor() {
        return color;
    }
}
