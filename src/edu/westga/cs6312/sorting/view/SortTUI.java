package edu.westga.cs6312.sorting.view;

import java.util.Scanner;
import edu.westga.cs6312.sorting.model.ArrayUtility;
import edu.westga.cs6312.sorting.model.SortTimer;

/**
 * This will serve as the TUI for the Sort application
 * 
 * @author J. Allen Burton
 * @version Mar 26, 2020
 *
 */
public class SortTUI {
	private ArrayUtility userArrayUtility;
	private SortTimer userSortTimer;
	private Scanner input;

	/**
	 * Constructor for SortTUI objects
	 *
	 * @precondition	none
	 *
	 * @postcondition 	new SortTUI created 
	 */
	public SortTUI() {
		this.userArrayUtility = new ArrayUtility();
		this.userSortTimer = new SortTimer();
		this.input = new Scanner(System.in);
	}

	/**
	 * This method serves as the director of the user interface
	 *
	 * @precondition none
	 *
	 * @postcondition changes to the object dictated by private methods within this
	 *                method
	 */
	public void run() {
		int userArraySize;	
		System.out.println("Welcome to the Sort Comparison Application.");				
		userArraySize = this.getPositiveIntegerFromUser("Please enter an array size");		

		int[] arrayForSelectionSort = this.userArrayUtility.createArray(userArraySize);
		int[] arrayForMergeSort = this.userArrayUtility.copyArray(arrayForSelectionSort);	

		System.out.println("Before sorting, Selection's array is sorted:\t" + this.userArrayUtility.isInNonIncreasingOrder(arrayForSelectionSort));
		this.userSortTimer.startTimer();
		this.userArrayUtility.selectionSort(arrayForSelectionSort);
		this.userSortTimer.stopTimer();
		System.out.println("After sorting, Selection's array is sorted:\t" + this.userArrayUtility.isInNonIncreasingOrder(arrayForSelectionSort));
		System.out.println("Selection sort took:\t" + this.userSortTimer.getElapsedTime() + " milliseconds");
		
		System.out.println("Before sorting, Merge's array is sorted:\t" + this.userArrayUtility.isInNonIncreasingOrder(arrayForMergeSort));
		this.userSortTimer.startTimer();
		this.userArrayUtility.mergeSort(arrayForMergeSort);
		this.userSortTimer.stopTimer();
		System.out.println("After sorting, Merge's array is sorted:\t" + this.userArrayUtility.isInNonIncreasingOrder(arrayForMergeSort));	
		System.out.println("Merge sort took:\t" + this.userSortTimer.getElapsedTime() + " milliseconds");
		
		System.out.println("Thank you for using the Sort Comparison Application.");
	}

	/**
	 * This method displays the message provided in the parameter, reads the user
	 * input, and returns the integer provided by the user.
	 * 
	 * @return integer value provided by the user
	 *
	 * @precondition none
	 *
	 * @postcondition integer returned corresponding to user input
	 */
	private int getPositiveIntegerFromUser(String message) {
		String input = "";
		int userInteger = 0;
		boolean isValid = false;
		do {
			try {
				System.out.println(message);
				input = this.input.nextLine();
				userInteger = Integer.parseInt(input);
				if (userInteger > 0) {
					isValid = true;
				}
			} catch (NumberFormatException nfe) {
				System.out.println("Your entry (" + input + ") was not a valid integer greater than zero.  Please try again.");
			}
		} while (!isValid);
		return userInteger;
	}
}
