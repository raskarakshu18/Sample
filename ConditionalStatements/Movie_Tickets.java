package com.java.ConditionalStatements;

import java.util.Scanner;

public class Movie_Tickets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Write a program to calculate the total movie ticket prices based on following
		 * conditions: Adult ticket – INR 200/- Half Ticket – INR 135/- The user will
		 * enter the number of persons and age of each
		 */

		Scanner input = new Scanner(System.in);

		System.out.println("Please Enter Your Age");

		int age = input.nextInt();

		System.out.println("Please enter No of adult persons");

		int numberadult = input.nextInt();

		System.out.println("Please enter No of Half persons");

		int numberHalf = input.nextInt();

		int adult = 200;

		int half = 135;

		if (age >= 18 || age <= 18) {
			int adultBill = numberadult * adult;
			int halfBill = numberHalf * half;

			double billPayable = adultBill + halfBill;
			System.out.println("total Bill payable is : " + billPayable);
		}
		
		input.close();

	}

}
