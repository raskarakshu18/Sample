package com.java.String;

import java.util.Scanner;

public class Using_part_of_a_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * String class substring() method returns a part of the string. substring()
		 * method has two forms: public String substring(int begin); // begin is
		 * starting point to the end of original string. public String substring(int
		 * begin, int end); Write a program to print the output as shown below from the
		 * string “Techcanvass Academy".
		 */

		Scanner input = new Scanner(System.in);

		System.out.println("Please Enter any statement");

		String statement = input.nextLine();

		System.out.println(statement);

		System.out.println(statement.substring(2));

		System.out.println(statement.substring(5, 10));

		System.out.println(statement.subSequence(5, 12));
		
		input.close();

	}

}
