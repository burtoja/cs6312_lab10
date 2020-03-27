package edu.westga.cs6312.sorting.controller;

import edu.westga.cs6312.sorting.view.SortTUI;

/**
 * This class will serve as the driver for the Sort application
 * 
 * @author J. Allen Burton
 * @version Mar 26, 2020
 *
 */
public class SortDriver {
	/**
	* This method is the entry point of the application
	*
	* @param args Command-line arguments, not used
	*/
	public static void main(String [] args) {
		SortTUI userSortTUI = new SortTUI();
		userSortTUI.run();
	}	
}
