package ca1.task3;

public class ArrayCount {
	public static int count(int[] numbers, int target) {
		int count = 0;
		
		for(int num : numbers) {
			if (num == target) {
				count++;
			}
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		
		int[] numbers = {1, 2, 3, 4, 3, 5, 3};
		int target = 3;
		
		int result = count(numbers, target);
		
		System.out.println("The targe " + target + " appears " + result + " times in the array !");
	}
}
