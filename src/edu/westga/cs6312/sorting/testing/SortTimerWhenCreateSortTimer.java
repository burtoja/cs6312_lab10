package edu.westga.cs6312.sorting.testing;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6312.sorting.model.SortTimer;

/**
 * This will serve as a test class for the SortTimer constructor and toString
 * method 
 * 
 * @author J. Allen Burton
 * @version Mar 22, 2020
 *
 */
public class SortTimerWhenCreateSortTimer {

	/**
	 * This will serve to test the creation of a new SortTimer object. An object
	 * should be created with start and end times still null and isRunning set to
	 * false.
	 */
	@Test
	public void testCreateNewSortTimerExpectNullNullFalse() {
		SortTimer theSortTimer = new SortTimer();
		String report = theSortTimer.toString();
		assertEquals("Start: null\tEnd: null\tRunning: false", report);
	}

}
