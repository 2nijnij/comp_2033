package ca1.task3;

public class ArrayCount {
	public int count(String[] array, String target) {
		int count = 0;
		
		for(String num : array) {
			if (num == target) {
				count++;
			}
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		
		
	}
}
