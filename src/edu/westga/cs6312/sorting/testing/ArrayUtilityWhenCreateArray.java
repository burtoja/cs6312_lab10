package edu.westga.cs6312.sorting.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6312.sorting.model.ArrayUtility;

/**
 * This test class will serve to test the createArray method in the ArrayUtility
 * class by calling the createArray method to create an array of random integers
 * and then verifying that the size of the array matches expectations
 * 
 * @author J. Allen Burton
 * @version Mar 25, 2020
 *
 */

public class ArrayUtilityWhenCreateArray {

	/**
	 * This test will call the createArray method to create an array of size 5.
	 * Expected length is 5.
	 */
	@Test
	public void testCreateArrayLength5Expect5() {
		ArrayUtility theArrayUtility = new ArrayUtility();
		int[] testList = theArrayUtility.createArray(5);
		int result = testList.length;
		assertEquals(5, result);
	}
	
	/**
	 * This test will call the createArray method to create an array of size 500.
	 * Expected length is 500.
	 */
	@Test
	public void testCreateArrayLength500Expect500() {
		ArrayUtility theArrayUtility = new ArrayUtility();
		int[] testList = theArrayUtility.createArray(500);
		int result = testList.length;
		assertEquals(500, result);
	}

}
