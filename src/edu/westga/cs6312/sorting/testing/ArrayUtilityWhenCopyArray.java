package edu.westga.cs6312.sorting.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6312.sorting.model.ArrayUtility;

/**
 * This will serve to test the copyArray method in the ArrayUtility class
 * 
 * @author J. Allen Burton
 * @version Mar 25, 2020
 *
 */

public class ArrayUtilityWhenCopyArray {

	/**
	 * This method will test the copyArray method. It will be supplied with an array
	 * of integers and should produce an exact copy
	 * 
	 */
	@Test
	public void testCopyArrayExpectIdenticalArray() {
		ArrayUtility theArrayUtility = new ArrayUtility();
		int[] testList = new int[] { 4, 5, 6, 7, 8 };
		String expectedDigits = "";
		for (int current : testList) {
			expectedDigits += current;
		}
		int[] copyOfList = theArrayUtility.copyArray(testList);
		String actualDigits = "";
		for (int current : copyOfList) {
			actualDigits += current;
		}
		assertEquals(expectedDigits, actualDigits);
	}

}
