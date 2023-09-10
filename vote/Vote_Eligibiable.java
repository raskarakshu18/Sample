package com.java.vote;

import java.util.Scanner;

public class Vote_Eligibiable extends CheckClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.println("Please Enter Your Age");

		int age = input.nextInt();

		boolean checking = checkeligibity(age);

		if (checking == true) {
			System.out.println("You are Eligiable for vote : " + age);
		} else {
			System.out.println("You are not eligiable for vote");
			System.out.println("Your age is under 18");
			System.out.println("!!Exsit");
		}
	}

}
