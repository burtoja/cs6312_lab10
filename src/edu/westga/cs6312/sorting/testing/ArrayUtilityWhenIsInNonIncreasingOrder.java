package edu.westga.cs6312.sorting.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6312.sorting.model.ArrayUtility;

/**
 * This will serve as a test class for the isInNonIncreasingOrder method
 * 
 * @author J. Allen Burton
 * @version Mar 25, 2020
 *
 */
public class ArrayUtilityWhenIsInNonIncreasingOrder {

	/**
	 * Test isInNonIncreasingOrder method with an increasing order array integers.
	 * EXPECT: false
	 */
	@Test
	public void testIsInNonIncreasingOrderExpectFalse() {
		ArrayUtility theArrayUtility = new ArrayUtility();
		int[] testList = new int[] { 4, 5, 6, 7, 8 };
		Boolean report = theArrayUtility.isInNonIncreasingOrder(testList);
		assertEquals(false, report);
	}

	/**
	 * Test isInNonIncreasingOrder method with an non-increasing order array
	 * integers. EXPECT: true
	 */
	@Test
	public void testIsInNonIncreasingOrderExpectTrue() {
		ArrayUtility theArrayUtility = new ArrayUtility();
		int[] testList = new int[] { 8, 7, 6, 5, 4 };
		Boolean report = theArrayUtility.isInNonIncreasingOrder(testList);
		assertEquals(true, report);
	}

	/**
	 * Test isInNonIncreasingOrder method with an non-increasing order array
	 * integers with duplicate values. EXPECT: true
	 */
	@Test
	public void testIsInNonIncreasingOrderWithDupesExpectTrue() {
		ArrayUtility theArrayUtility = new ArrayUtility();
		int[] testList = new int[] { 8, 7, 7, 5, 5 };
		Boolean report = theArrayUtility.isInNonIncreasingOrder(testList);
		assertEquals(true, report);
	}

	/**
	 * Test isInNonIncreasingOrder method with an increasing order array integers.
	 * EXPECT: false
	 */
	@Test
	public void testIsInNonIncreasingOrderWithDupesExpectFalse() {
		ArrayUtility theArrayUtility = new ArrayUtility();
		int[] testList = new int[] { 4, 5, 5, 7, 7 };
		Boolean report = theArrayUtility.isInNonIncreasingOrder(testList);
		assertEquals(false, report);
	}

	/**
	 * Test isInNonIncreasingOrder method with an array integers that is
	 * non-increasing until the last number. EXPECT: false
	 */
	@Test
	public void testIsInNonIncreasingOrderWithMixedExpectFalse() {
		ArrayUtility theArrayUtility = new ArrayUtility();
		int[] testList = new int[] { 80, 70, 60, 50, 40, 80 };
		Boolean report = theArrayUtility.isInNonIncreasingOrder(testList);
		assertEquals(false, report);
	}
	
	/**
	 * Test isInNonIncreasingOrder method with an array integers that is
	 * non-increasing until the last number. EXPECT: false
	 */
	@Test
	public void testIsInNonIncreasingOrderWithSize1ExpectTrue() {
		ArrayUtility theArrayUtility = new ArrayUtility();
		int[] testList = new int[] { 8 };
		Boolean report = theArrayUtility.isInNonIncreasingOrder(testList);
		assertEquals(true, report);
	}

}
