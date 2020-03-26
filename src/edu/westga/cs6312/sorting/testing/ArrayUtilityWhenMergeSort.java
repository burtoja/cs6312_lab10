package edu.westga.cs6312.sorting.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6312.sorting.model.ArrayUtility;

/**
 * This will serve to test the mergeSort method in the ArrayUtility class
 * 
 * @author J. Allen Burton
 * @version Mar 25, 2020
 *
 */
public class ArrayUtilityWhenMergeSort {

	/**
	 * This will test the mergeSort method by providing an array of integers in
	 * ascending order. After the method is called to sort the array, the values of
	 * the array will be read into a string of the integers (no spaces) used for
	 * comparison against the expected value.
	 * 
	 * EXPECT: "87654"
	 * 
	 */
	@Test
	public void testMergeSortOnAscendingArrayExpect87654() {
		ArrayUtility theArrayUtility = new ArrayUtility();
		int[] testList = new int[] { 4, 5, 6, 7, 8 };
		theArrayUtility.mergeSort(testList);
		String report = "";
		for (int current : testList) {
			report += current;
		}
		assertEquals("87654", report);
	}

	/**
	 * This will test the mergeSort method by providing an array of integers in
	 * ascending order. After the method is called to sort the array, the values of
	 * the array will be read into a string of the integers (no spaces) used for
	 * comparison against the expected value.
	 * 
	 * EXPECT: "87654"
	 * 
	 */
	@Test
	public void testMergeSortOnDescendingArrayExpect87654NoChange() {
		ArrayUtility theArrayUtility = new ArrayUtility();
		int[] testList = new int[] { 8, 7, 6, 5, 4 };
		theArrayUtility.mergeSort(testList);
		String report = "";
		for (int current : testList) {
			report += current;
		}
		assertEquals("87654", report);
	}

	/**
	 * This will test the mergeSort method by providing an array of integers in
	 * non-ascending order with dupes. After the method is called to sort the array,
	 * the values of the array will be read into a string of the integers (no
	 * spaces) used for comparison against the expected value.
	 * 
	 * EXPECT: "87755"
	 * 
	 */
	@Test
	public void testMergeSortOnNonAscendingArrayWithDupesExpect87755() {
		ArrayUtility theArrayUtility = new ArrayUtility();
		int[] testList = new int[] { 8, 7, 7, 5, 5 };
		theArrayUtility.mergeSort(testList);
		String report = "";
		for (int current : testList) {
			report += current;
		}
		assertEquals("87755", report);
	}

	/**
	 * This will test the mergeSort method by providing an array of integers in
	 * ascending order with dupes. After the method is called to sort the array, the
	 * values of the array will be read into a string of the integers (no spaces)
	 * used for comparison against the expected value.
	 * 
	 * EXPECT: "887665"
	 * 
	 */
	@Test
	public void testMergeSortOnAscendingArrayWithDupesExpect887665() {
		ArrayUtility theArrayUtility = new ArrayUtility();
		int[] testList = new int[] { 5, 6, 6, 7, 8, 8 };
		theArrayUtility.mergeSort(testList);
		String report = "";
		for (int current : testList) {
			report += current;
		}
		assertEquals("887665", report);
	}

	/**
	 * This will test the mergeSort method by providing an array of integers in
	 * mixed order. After the method is called to sort the array, the values of the
	 * array will be read into a string of the integers (no spaces) used for
	 * comparison against the expected value.
	 * 
	 * EXPECT: "887542"
	 * 
	 */
	@Test
	public void testMergeSortOnMixedArrayWithDupesExpect887665() {
		ArrayUtility theArrayUtility = new ArrayUtility();
		int[] testList = new int[] { 5, 1, 2, 7, 8, 4 };
		theArrayUtility.mergeSort(testList);
		String report = "";
		for (int current : testList) {
			report += current;
		}
		assertEquals("875421", report);
	}

	/**
	 * This will test the mergeSort method by providing an array of integers in
	 * mixed order with dupes. After the method is called to sort the array, the
	 * values of the array will be read into a string of the integers (no spaces)
	 * used for comparison against the expected value.
	 * 
	 * EXPECT: "887542"
	 * 
	 */
	@Test
	public void testMergeSortOnMixedArrayExpect887665() {
		ArrayUtility theArrayUtility = new ArrayUtility();
		int[] testList = new int[] { 5, 8, 2, 7, 8, 4 };
		theArrayUtility.mergeSort(testList);
		String report = "";
		for (int current : testList) {
			report += current;
		}
		assertEquals("887542", report);
	}

	/**
	 * This will test the mergeSort method by providing an array of integers
	 * which includes negative numbers in mixed order with dupes and a zero. After the method
	 * is called to sort the array, the values of the array will be read into a
	 * string of the integers (no spaces) used for comparison against the expected
	 * value.
	 * 
	 * EXPECT: "88540-5-5-9"
	 * 
	 */
	@Test
	public void testMergeSortOnMixedWithNegsAndZero() {
		ArrayUtility theArrayUtility = new ArrayUtility();
		int[] testList = new int[] { 5, 8, 4, -5, -9, -5, 0, 8 };
		theArrayUtility.mergeSort(testList);
		String report = "";
		for (int current : testList) {
			report += current;
		}
		assertEquals("88540-5-5-9", report);
	}

}

