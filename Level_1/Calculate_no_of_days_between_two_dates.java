package com.java.Level_1;

import java.util.Date;
import java.util.GregorianCalendar;

public class Calculate_no_of_days_between_two_dates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Write a program to find the number of days between two dates
		 * 
		 */
		Date startDate = new GregorianCalendar(2016, 1, 1, 0, 0).getTime();
		Date endDate = new GregorianCalendar(2016, 2, 1, 0, 0).getTime();

		long diff = endDate.getTime() - startDate.getTime();

		System.out.println("Difference between " + startDate + " and " + endDate + "\n" + "is "
				+ (diff / (1000 * 60 * 60 * 24)) + " days.");

	}

}
