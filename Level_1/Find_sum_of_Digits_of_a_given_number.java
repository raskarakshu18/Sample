package com.java.Level_1;

import java.util.Scanner;

public class Find_sum_of_Digits_of_a_given_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * To find sum of digits means add all the digits of that number. For example:
		 * Number: 734 Sum of all digits is 7 + 3 + 4 = 14 Write a program to calculate
		 * the sum of its digits
		 */

		Scanner input = new Scanner(System.in);

		System.out.println("Please Enter the Integer Number");

		int inputFromUser = input.nextInt();

		int number = inputFromUser;

		int sumOfDigits = 0;

		while (number != 0) {

			sumOfDigits += number % 10;

			number = number / 10;

		}
		System.out.println(sumOfDigits);
	}

}
