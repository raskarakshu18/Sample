package com.java.String;

import java.util.Scanner;

public class Trimming_a_text {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * String class has method trim(). It returns the substring after removing
		 * leading and trailing white spaces from the original string. Write a program
		 * to trim text values, entered by user with leading and trailing white spaces.
		 */

		Scanner input = new Scanner(System.in);

		System.out.println("Please Enter any Statement with extra white spaces");

		String statement = input.nextLine();

		System.out.println("Remove extra whith space from statement : ");
		System.out.println(statement.trim());

//		statement = statement.trim()
		
		System.out.println(statement.codePointAt(4));
		System.out.println(statement.equals(statement));
				
		input.close();

	}

}
