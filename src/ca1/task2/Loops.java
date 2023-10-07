package ca1.task2;


// implement the printWords method within a loop
// set the parameter to determine the total number of times the loop should run

public class Loops {
	public void printWords(int numberOfTimes) {
		for (int i = 0; i < numberOfTimes; i++) {
			System.out.println("words");
		}
	}
	
	
//Add a 'main' method	
	public static void main(String[] args) {
		
		Loops loops = new Loops();
		
// Call the printWords method for verifying the implementation
		loops.printWords(3);

	}
}
