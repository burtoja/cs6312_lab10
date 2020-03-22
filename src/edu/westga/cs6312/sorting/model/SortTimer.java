package edu.westga.cs6312.sorting.model;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

/**
 * This class will serve as a utility class manage timing of the sort methods.
 * 
 * @author J. Allen Burton
 * @version Mar 21, 2020
 *
 */
public class SortTimer {
	private Instant startTime;
	private Instant endTime;
	private boolean isRunning;

	/**
	 * Constructor for SortTimer objects.
	 *
	 * @precondition none
	 *
	 * @postcondition new SortTimer object created with isRunning set to false
	 */
	public SortTimer() {
		this.startTime = null;
		this.endTime = null;
		this.isRunning = false;
	}

	/**
	 * This method starts the timer by recording the current time (from system
	 * clock) as the start time and setting the isRunning status to true.
	 *
	 * @precondition isRunning == false
	 *
	 * @postcondition startTime is set to current time and isRunning is set to true
	 */
	public void startTimer() {
		if (isRunning == false) {
			this.startTime = Instant.now();
			this.isRunning = true;
		}
	}

	/**
	 * This method stops the timer by recording the current time (from system clock)
	 * as the end time and setting the isRunning status to false.
	 *
	 * @precondition isRunning == true
	 *
	 * @postcondition endTime is set to current time and isRunning status is set to
	 *                false
	 */
	public void stopTimer() {
		if (isRunning == true) {
			this.endTime = Instant.now();
			this.isRunning = false;
		}
	}

	/**
	 * This method computes the elapsed time from when the SortTimer object was
	 * started and stopped measured in milliseconds.
	 * 
	 * @return	the number of milliseconds between the start time and end time in the current object
	 *
	 * @precondition	endTime must be set (which in-turn means startTime is set) && isRunning == false
	 *
	 * @postcondition	no change to object
	 */
	public long getElapsedTime() {
		long elapsedTime = 0;
		if (isRunning == false && this.endTime != null) {
			elapsedTime = ChronoUnit.MILLIS.between(this.startTime, this.endTime);
		}
		return elapsedTime;
	}
	
	/**
	 * Produces a string representation of object variables of the form:
	 * "Start: xxxxx		Stop: xxxxx		Running: xxxxx"
	 * 
	 * @return	string representation of object variables
	 *
	 * @precondition	none
	 *
	 * @postcondition	no change to object
	 */
	@Override
	public String toString() {
		return "Start: " + this.startTime +  "\tEnd: " + this.endTime +  "\tRunning: " + this.isRunning;
	}
}
