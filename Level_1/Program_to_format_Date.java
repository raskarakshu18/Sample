package com.java.Level_1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Program_to_format_Date {

	public static void main(String[] args) {

		Date cDate = new Date();

		DateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		DateFormat sdf2 = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		DateFormat sdf3 = new SimpleDateFormat("dd-MMM-yyyy");
		DateFormat sdf4 = new SimpleDateFormat("MM dd, yyyy");
		DateFormat sdf5 = new SimpleDateFormat("E, MMM dd yyyy");
		DateFormat sdf6 = new SimpleDateFormat("E, MMM dd yyyy HH:mm:ss");

		// format() method Formats a Date into a date/time string.

		System.out.println(sdf1.format(cDate));
		System.out.println(sdf2.format(cDate));
		System.out.println(sdf3.format(cDate));
		System.out.println(sdf4.format(cDate));
		System.out.println(sdf5.format(cDate));
		System.out.println(sdf6.format(cDate));

	}

}
