package ca1.task3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ArrayCountTest {
	
	// Situation 1 (Target not in Array)
	 void testCountTargetNotInArray() {
	        int[] array = {1, 2, 3, 4, 5};
	        int target = 6;
	        int result = ArrayCount.count(array, target);
	        assertEquals(0, result, "Count of target in an array is 0");
	    }

	// Situation 2 (Target appears only once in Array)
	    void testCountTargetOnceInArray() {
	        int[] array = {1, 2, 3, 4, 5};
	        int target = 3;
	        int result = ArrayCount.count(array, target);
	        assertEquals(1, result, "Count of target appearing once should be 1");
	    }
	    
	// Situation 3 (Target appears multiple times in Array)
}
