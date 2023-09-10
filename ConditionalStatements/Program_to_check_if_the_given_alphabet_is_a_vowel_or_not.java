package com.java.ConditionalStatements;

import java.util.Scanner;

public class Program_to_check_if_the_given_alphabet_is_a_vowel_or_not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Take a character (alphabet) through user. If character is equal to a, A, e,
		 * E, i, I, o, O, u, U, then it will be vowel otherwise it will not be a vowel.
		 * Write a program to check by taking user input
		 * 
		 */

		Scanner input = new Scanner(System.in);

		System.out.println("Please Enter any character");

		char character = input.next().charAt(0);

		if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u'||
			character == 'A' || character == 'E' || character == 'I' || character == 'O' || character == 'U') {
			System.out.println("User enter character is vowel : " + character);

		}
//		if (character == 'A' || character == 'E' || character == 'I' || character == 'O' || character == 'U') {
//			System.out.println("User enter character is vowel : " + character);
//		}
		else {

			System.out.println("User Enter character is not vowel : " + character);
		}
		input.close();

	}

}
