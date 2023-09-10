package com.java.Level_1;

import java.util.Scanner;

public class Count_the_number_of_Digits_in_an_Integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Logic for counting the digits of a given number:- Count how many times number
		 * has to be divided by ten before the number becomes zero. For example:- 1234
		 * --> 123 --> 12 --> 1 --> 0 1 2 3 4 If given number is zero, the number of
		 * digit is one. Write a program for the logic described above.
		 */

		Scanner input = new Scanner(System.in);
		
		System.out.println("Please Enter any Integer number");

		int totalnumber = input.nextInt();

		int number = totalnumber;

		int noofDigit = 0;

		do {
			noofDigit++;

			number = number / 10;

		} while (number != 0);

		System.out.println("nof of digit : " + totalnumber + " : " + noofDigit);

		input.close();
	}

}
