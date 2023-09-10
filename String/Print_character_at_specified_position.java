package com.java.String;

public class Print_character_at_specified_position {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * String class charAt() function returns the character located at the specified
		 * index. Write a program to find the 10th, 12th and 15th character from the
		 * following sentence:
		 * 
		 * “I am learning Java”
		 * 
		 */

		String name = "I am learning Java";

		System.out.println(name);

		System.out.println(name.charAt(10));
		System.out.println(name.charAt(12));
		System.out.println(name.charAt(15));
		System.out.println(name.chars());
		System.out.println(name.toCharArray());

	}

}
