package ca1.task3;

// Use static for the count method
public class ArrayCount {
	public static int count(int[] numbers, int target) {

// Initialize valuable as 0
		int count = 0;

		for(int num : numbers) {
			if (num == target) {
				count++;
			}
		}
		
		return count;
	}

	
// Add a main method
	public static void main(String[] args) {
		
		int[] numbers = {1, 2, 3, 4, 3, 5, 3};
		int target = 3;
		
		int result = count(numbers, target);
		
		System.out.println("The targe number " + "'" + target + "'" + " appears " + result + " times in the array !");
	}
}
