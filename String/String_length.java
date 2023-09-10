package com.java.String;

import java.util.Scanner;

public class String_length {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * String class has length() method. Write a program to take a string input from
		 * user and then find the length of that string using the method length() and
		 * print the length value of the .
		 */

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter any Sentance");

		String sentance = input.nextLine();
		System.out.println("Please enter any one word");
		String word = input.next();

		System.out.println(sentance);

		System.out.println("Length : " + sentance.length());
		System.out.println("Length of word :" + word.length());

		input.close();

	}

}
