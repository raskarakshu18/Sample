package com.java.Array;

import java.util.Scanner;

public class Comparison_with_array_elements {

	public static void main(String[] args) {
		/*
		 * Write a program to compare the user provided value and check if it matches
		 * with any of the elements of the months array. Display a message if it matches
		 * 
		 */

		String[] month = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

		Scanner input = new Scanner(System.in);

		System.out.println("Please Enter the any month name");

		String month_name = input.nextLine();
		boolean matched = false;

		for (int i = 0; i < month.length; i++) {

			if (month[i].equalsIgnoreCase(month_name)) {
				System.out.println(
						"You have Enter : " + month_name + " : & " + month[i] + " : it is already exsited in the list");
				matched = true;
			}
		}
		if (matched == false) {
			System.out.println("You have Enter : " + month_name + " : it is not already exsited in the list");
		}

		input.close();
	}
}
