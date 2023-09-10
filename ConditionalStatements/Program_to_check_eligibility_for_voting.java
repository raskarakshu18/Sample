package com.java.ConditionalStatements;

import java.util.Scanner;

public class Program_to_check_eligibility_for_voting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Write a program to allow the user to input his/her age and check if the voter
		 * is eligible to vote. A person who is eligible to vote must be older than or
		 * equal to 18 years old. Write a function called “checkEligibility()” to
		 * perform this operation. You need to make the function static, if you are
		 * calling it from main, which is also static. You can create a new class, there
		 * you don’t need to make the function static. Next exercise does precisely
		 * that.
		 */

		checkEligibility();

	}

	public static void checkEligibility() {

		Scanner input = new Scanner(System.in);

		System.out.println("Please Enter your Age");

		int age = input.nextInt();

		if (age >= 18) {
			System.out.println("Your are Eligiable for vote : " + age);
		} else {
			System.out.println("Your are not Eligiable for vote");
			System.out.println("Your Age is under 18 : age : " + age);
			System.out.println("!!Extis");
		}
		input.close();
	}

}
