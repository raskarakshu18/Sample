package com.java.Level_1;

import java.util.Scanner;

public class Square_root_of_a_given_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Math.sqrt - Math class in Java has function to calculate Square root. Write a
		 * program to find square root of a number, entered by the user
		 */

		Scanner input = new Scanner(System.in);

		System.out.println("Please Enter any Integer Number");

		int number = input.nextInt();

//		System.out.println("Square root of :"+number+" is : "+Math.sqrt(number));

		if (number % Math.sqrt(number) == 0) {
			System.out.println("Square root of :" + number + " is : " + Math.sqrt(number));
		} else {
			System.out.println("Please Enter valid input (Square digit)");
		}
	}

}
