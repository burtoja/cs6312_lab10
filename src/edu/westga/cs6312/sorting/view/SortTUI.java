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
	 * @precondition none
	 *
	 * @postcondition new SortTUI created
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
		userArraySize = this.getIntegerGreaterThanOneFromUser("Please enter an array size: ");
		int[] arrayForSelectionSort = this.userArrayUtility.createArray(userArraySize);
		int[] arrayForMergeSort = this.userArrayUtility.copyArray(arrayForSelectionSort);

		this.printIsSortedMessage(arrayForSelectionSort, "Selection", "Before");
		this.userSortTimer.startTimer();
		this.userArrayUtility.selectionSort(arrayForSelectionSort);
		this.userSortTimer.stopTimer();
		this.printIsSortedMessage(arrayForSelectionSort, "Selection", "After");
		this.printTimingResultsMessage(arrayForSelectionSort, "Selection");

		this.printIsSortedMessage(arrayForMergeSort, "Merge", "Before");
		this.userSortTimer.startTimer();
		this.userArrayUtility.mergeSort(arrayForMergeSort);
		this.userSortTimer.stopTimer();
		this.printIsSortedMessage(arrayForMergeSort, "Merge", "After");
		this.printTimingResultsMessage(arrayForMergeSort, "Merge");

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
	private int getIntegerGreaterThanOneFromUser(String message) {
		String input = "";
		int userInteger = 0;
		boolean isValid = false;
		do {
			try {
				System.out.println(message);
				input = this.input.nextLine();
				userInteger = Integer.parseInt(input);
				if (userInteger > 1) {
					isValid = true;
				} else {
					System.out.println("Array size must be greater than one to perform sorting operations.\n");
				}
			} catch (NumberFormatException nfe) {
				System.out.println("Your entry (" + input + ") was not a valid integer.  Please try again.");
			}
		} while (!isValid);
		return userInteger;
	}

	/**
	 * Prints to console the message stating the whether the array elements are in
	 * non-increasing order
	 * 
	 * @param theArray     the array that is going to or has been timed
	 * @param sortTypeName the sort type that will or has been performed (i.e.
	 *                     "Merge" or "Selection")
	 * @param beforeAfter  a string to be printed indicating whether this message
	 *                     refers to the state before the sort or after the sort has
	 *                     been performed ("Before" or "After")
	 *
	 * @precondition theArray != null (handled elsewhere)
	 * 
	 * @postcondition no change to object
	 */
	private void printIsSortedMessage(int[] theArray, String sortTypeName, String beforeAfter) {
		System.out.println(" " + beforeAfter + " sorting, " + sortTypeName + "'s array is sorted:\t"
				+ this.userArrayUtility.isInNonIncreasingOrder(theArray));
	}

	/**
	 * Prints to console the message stating the elapsed time of sort operation
	 * 
	 * @param theArray     The array that was acted upon
	 * @param sortTypeName a string representation of the type of sort (i.e. "Merge"
	 *                     or "Selection")
	 *
	 * @precondition theArray != null (handled elsewhere) and userSortTimer has been
	 *               started and stopped
	 * 
	 *
	 * @postcondition no change to object
	 */
	private void printTimingResultsMessage(int[] theArray, String sortTypeName) {
		System.out.println(
				" " + sortTypeName + " sort took:\t" + this.userSortTimer.getElapsedTime() + " milliseconds\n");
	}
}
