package com.java.String;

import java.util.Scanner;

public class Convert_given_string_to_uppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * String class has method toUpperCase () to convert string to uppercase. Write
		 * a program to convert any user entered text to upper case.
		 */
		Scanner input = new Scanner(System.in);

		System.out.println("Please Enter any Sentance");

		String name = input.nextLine();

		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());

		input.close();
	}

}
