package com.java.String;

import java.util.Scanner;

public class Reverses_a_string_entered_by_the_user {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * This java program reverses a string entered by the user. We use charAt method
		 * to extract characters from the string and append them in reverse order to
		 * reverse the entered string.
		 *
		 * Write a program to reverse the string entered by the user.
		 */

		Scanner input = new Scanner(System.in);

		System.out.println("Pleae Enter any one statement");

		String originalStatement = input.nextLine();

		String reverseStatement = "";
		String str = "";

		for (int i = originalStatement.length() - 1; i >= 0; i--) {

			reverseStatement = reverseStatement + originalStatement.charAt(i);

		}
		System.out.println(reverseStatement);

		System.out.println("Please Enter you any Statement");

		String statement = input.nextLine();

		for (int i = statement.length() - 1; i >= 0; i--) {
			str = str + statement.charAt(i);
		}
		System.out.println();
		System.out.println(str);
		input.close();

	}

}
