package ca1.task3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


class ArrayCountTest {
	
	// Situation 1 (Target not in Array)
	@Test
	 void testCountTargetNotInArray() {
	        int[] array = {1, 2, 3, 4, 5};
	        int target = 6;
	        int result = ArrayCount.count(array, target);
	        assertEquals(0, result, "Count of target in an array is 0");
	    }

	// Situation 2 (Target appears only once in Array)
	@Test
	    void testCountTargetOnceInArray() {
	        int[] array = {1, 2, 3, 4, 5};
	        int target = 5;
	        int result = ArrayCount.count(array, target);
	        assertEquals(1, result, "Count of target appearing in this array only once, should be 1");
	    }
	    
	// Situation 3 (Target appears multiple times in Array)
	@Test    
		void testCountTargetMultipleTimesInArray() {
	        int[] array = {1, 2, 3, 4, 5, 5, 3, 5};
	        int target = 5;
	        int result = ArrayCount.count(array, target);
	        assertEquals(3, result, "Count of target appearing multiple times in this array, should be 3");
	    }

}
