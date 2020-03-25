package edu.westga.cs6312.sorting.model;

import java.util.Random;

/**
 * This class will provide variety of different methods to generate and
 * manipulate simple arrays of integers
 * 
 * @author J. Allen Burton
 * @version Mar 23, 2020
 *
 */
public class ArrayUtility {
	private Random numberGenerator;

	/**
	 * Constructor for ArrayUtility objects
	 *
	 * @precondition none
	 *
	 * @postcondition new object created
	 */
	public ArrayUtility() {
		this.numberGenerator = new Random();
	}

	/**
	 * This method will create an array of size, size, populate it with random
	 * numbers between the minimum and maximum integer values
	 * 
	 * @param size
	 * 
	 * @return array of integers of size size
	 *
	 * @precondition size > 0
	 *
	 * @postcondition no change to object
	 */
	public int[] createArray(int size) {
		if (size < 1) {
			throw new IllegalArgumentException("Size of array must be greater than zero");
		}
		int[] numberArray = new int[size];
		for (int entry = 0; entry < size; entry++) {
			numberArray[entry] = this.numberGenerator.nextInt();
		}
		return numberArray;
	}

	/**
	 * This method will return true if and only if the elements in the array are in
	 * non-increasing order.
	 * 
	 * @param theArray
	 * 
	 * @return true if array elements are in non-increasing order
	 *
	 * @precondition theArray != null && theArray.length > 0
	 *
	 * @postcondition no change to this object or parameter array
	 */
	public boolean isInNonIncreasingOrder(int[] theArray) {
		if (theArray == null || theArray.length < 1) {
			throw new IllegalArgumentException("Array must have at least one value");
		}
		boolean notIncreasingOrder = true;
		int previousEntry = theArray[0];
		for (int current : theArray) {
			if (current > previousEntry) {
				notIncreasingOrder = false;
				break;
			} else {
				previousEntry = current;
			}
		}
		return notIncreasingOrder;
	}

	/**
	 * This method will swap the values stored in theArray at indexes index1 and
	 * index2
	 * 
	 * @param index1   the index of first swap value
	 * @param index2   the index of second swap value
	 * @param theArray the array holding the values to be swapped
	 *
	 * @precondition the array must have at least 2 values && the two indices must
	 *               be within the size of the array
	 *
	 * @postcondition no change to this object (parameter array has the two values
	 *                swapped)
	 */
	public void swapElements(int index1, int index2, int[] theArray) {
		if (theArray == null || theArray.length < 2) {
			throw new IllegalArgumentException("Array must have at least 2 values");
		}
		if (index1 >= theArray.length || index2 >= theArray.length) {
			throw new IllegalArgumentException("Each index must be within the size of the provided array");
		}
		int originalIndex1Value = theArray[index1];
		theArray[index1] = theArray[index2];
		theArray[index2] = originalIndex1Value;
	}

	/**
	 * This method will create a brand new array, copy each element from theArray
	 * and store it in the corresponding index in the new array. The new array will
	 * then be returned.
	 * 
	 * @param theArray the array to be copied
	 * 
	 * @return a new array identical to theArray
	 *
	 * @precondition theArray != null and must have at least one element
	 *
	 * @postcondition no change to object
	 */
	public int[] copyArray(int[] theArray) {
		if (theArray == null || theArray.length < 1) {
			throw new IllegalArgumentException("Array must have at least one value");
		}
		int[] newArray = new int[theArray.length];
		for (int currentIndex = 0; currentIndex < theArray.length; currentIndex++) {
			newArray[currentIndex] = theArray[currentIndex];
		}
		return newArray;
	}

	/**
	 * This method will sort the elements in theArray into nonincreasing order
	 * using the selection sort algorithm
	 * 
	 * @param theArray	array of integers to be sorted
	 *
	 * @precondition	theArray != null and must have at least one element
	 *
	 * @postcondition	no change to object (the Array is now sorted in non-increasing order)
	 */
	public void selectionSort(int[] theArray) {
		if (theArray == null || theArray.length < 1) {
			throw new IllegalArgumentException("Array must have at least one value");
		}
		for (int currentIndex = 0; currentIndex < theArray.length; currentIndex++) {
			int largestestIndex = currentIndex;
			for (int indexToCheck = currentIndex + 1; indexToCheck < theArray.length; indexToCheck++) {
				if (theArray[indexToCheck] > theArray[largestestIndex]) {
					largestestIndex = indexToCheck;
				}
			}
			this.swapElements(currentIndex, largestestIndex, theArray);
		}
	}
	
	/**
	 * This method will sort the elements in theArray into nonincreasing order
	 * using the merge sort algorithm
	 * 
	 * @param theArray	array of integers to be sorted
	 *
	 * @precondition	theArray != null and must have at least one element
	 *
	 * @postcondition	no change to object (the Array is now sorted in non-increasing order)
	 */
	public void mergeSort(int[] theArray) {
		if (theArray == null || theArray.length < 1) {
			throw new IllegalArgumentException("Array must have at least one value");
		}
		if (theArray.length < 2) {
			return;
		}
		int middleIndex = theArray.length / 2;
		int[] tempArrayA = new int[middleIndex];
		int[] tempArrayB = new int[theArray.length - middleIndex];
		for (int index = 0; index < middleIndex; index++) {
			tempArrayA[index] = theArray[index];
		}
		for (int index = middleIndex; index < theArray.length; index++) {
			tempArrayB[index - middleIndex] = theArray[index];
		}
		this.mergeSort(tempArrayA);
		this.mergeSort(tempArrayB);
		
		this.merge(tempArrayA, tempArrayB, theArray);
	}
	
	/**
	 * Helper method to manage the merging of sorted arrays
	 * 
	 * @param listA	list of sorted integers
	 * @param listB	list of sorted integers
	 * @param tempList	original unsorted array to have values 
	 *
	 * @precondition	TODO
	 *
	 * @postcondition	TODO
	 */
	private void merge(int[] listA, int[] listB, int[] tempList) {
		int currentA = 0; 
	    int currentB = 0; 
	    int currentTemp = 0; 
	    
	    while (currentA < listA.length && currentB < listB.length) {
	        if (listA[currentA] > listB[currentB])
	        	tempList[currentTemp++] = listA[currentA++];
	        else
	        	tempList[currentTemp++] = listB[currentB++];
	      }

	      while (currentA > listA.length)
	    	  tempList[currentTemp++] = listA[currentA++];

	      while (currentB > listB.length)
	    	  tempList[currentTemp++] = listB[currentB++];
	}
}
