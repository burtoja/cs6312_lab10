package edu.westga.cs6312.sorting.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6312.sorting.model.ArrayUtility;

/**
 * Tests for the swapElements method in the ArrayUtility class
 * 
 * @author J. Allen Burton
 * @version Mar 25, 2020
 *
 */
public class ArrayUtilityWhenSwapElements {

	/**
	 * Test the swapElements method on first two elements of array. Test creates
	 * string output of first two values in array in reverse order for expected
	 * output and then calls method before generating a string of the same form to
	 * compare as actual value.
	 * 
	 * Original Array: { 4, 5, 6, 7, 8 } EXPECT: "5, 4"
	 */
	@Test
	public void testSwapFirstTwoElements() {
		ArrayUtility theArrayUtility = new ArrayUtility();
		int[] testList = new int[] { 4, 5, 6, 7, 8 };
		String expected = testList[1] + ", " + testList[0];
		theArrayUtility.swapElements(0, 1, testList);
		String actual = testList[0] + ", " + testList[1];
		assertEquals(expected, actual);
	}

	/**
	 * Test the swapElements method on last two elements of array. Test creates
	 * string output of last two values in array in reverse order for expected
	 * output and then calls method before generating a string of the same form to
	 * compare as actual value.
	 * 
	 * Original Array: { 4, 5, 6, 7, 8 } EXPECT: "8, 7"
	 */
	@Test
	public void testSwapLastTwoElements() {
		ArrayUtility theArrayUtility = new ArrayUtility();
		int[] testList = new int[] { 4, 5, 6, 7, 8 };
		String expected = testList[4] + ", " + testList[3];
		theArrayUtility.swapElements(3, 4, testList);
		String actual = testList[3] + ", " + testList[4];
		assertEquals(expected, actual);
	}

	/**
	 * Test the swapElements method on last two elements of array but supplied to
	 * method in opposite order from the testSwapLastTwoElements test. Test creates
	 * string output of last two values in array in reverse order for expected
	 * output and then calls method before generating a string of the same form to
	 * compare as actual value.
	 * 
	 * Original Array: { 4, 5, 6, 7, 8 } EXPECT: "8, 7"
	 */
	@Test
	public void testSwapLastTwoElementsReverseParameters() {
		ArrayUtility theArrayUtility = new ArrayUtility();
		int[] testList = new int[] { 4, 5, 6, 7, 8 };
		String expected = testList[4] + ", " + testList[3];
		theArrayUtility.swapElements(4, 3, testList);
		String actual = testList[3] + ", " + testList[4];
		assertEquals(expected, actual);
	}
	
	/**
	 * Test the swapElements method on the end elements of array. Test creates
	 * string output of last two values in array in reverse order for expected
	 * output and then calls method before generating a string of the same form to
	 * compare as actual value.
	 * 
	 * Original Array: { 4, 5, 6, 7, 8 } EXPECT: "8, 7"
	 */
	@Test
	public void testSwapEndElements() {
		ArrayUtility theArrayUtility = new ArrayUtility();
		int[] testList = new int[] { 4, 5, 6, 7, 8 };
		String expected = testList[4] + ", " + testList[0];
		theArrayUtility.swapElements(0, 4, testList);
		String actual = testList[0] + ", " + testList[4];
		assertEquals(expected, actual);
	}
	
	

}
