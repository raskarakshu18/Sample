package com.java.String;

import java.util.Scanner;

public class Delete_all_vowels_from_user_inputted_sentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * String class removeAll() method replaces string with another string value.
		 * Write a program to delete all the vowels from the sentence entered by user.
		 * So this program should work for any sentence.
		 */

		Scanner input = new Scanner(System.in);

		System.out.println("Please Enter any one statement");

		String statement = input.nextLine();

		System.out.println(statement);

		System.out.println("Remove all vowels from the statement");

		System.out.println(statement.replaceAll("[aeiouAEIOU]", ""));

		System.out.println("Please Enter email ID");
		String emailID = input.nextLine();

		System.out.println(emailID);
		System.out.println(emailID.replaceAll("[^a-zA-Z0-9]", ""));

		System.out.println("Please enter the special char");

		String specialChar = input.nextLine();
		System.out.println(specialChar);

		System.out.println(specialChar.replaceAll("[^a-zA-Z0-9]", ""));
		
		

	}

}
