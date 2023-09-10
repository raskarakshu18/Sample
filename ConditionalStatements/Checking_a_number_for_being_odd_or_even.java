package com.java.ConditionalStatements;

import java.util.Scanner;

public class Checking_a_number_for_being_odd_or_even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Take a number through user. Divide the number by two, if the remainder is
		 * zero then the number is even else the number is odd. Write a program to do
		 * so.
		 */

		Scanner input = new Scanner(System.in);

		System.out.println("Please Enter any Number");

		double number = input.nextDouble();

		if (number % 2 == 0) {
			System.out.println("User enter number is even : " + number);
		} else {
			System.out.println("User Enter number is odd : " + number);
		}
		input.close();

	}

}
