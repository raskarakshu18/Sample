package com.java.String;

public class String_with_replaced_character_substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * String class replace() method replaces all occurrences of character/sequence
		 * of character with a specified new character/sequence of character. String
		 * class replaceAll() method replaces all occurrences of string with a specified
		 * new string. String class replaceFirst() method replaces first occurrences of
		 * string with a specified new string.
		 */

		String constructor = "Constructor does not return any value not even Null";

		System.out.println(constructor);

		System.out.println("char : " + constructor.replace('C', 'W'));

		System.out.println("String : " + constructor.replace("C", "Welcome c"));

		System.out.println(constructor.replaceAll(constructor, "Hello"));

		System.out.println(constructor.replaceAll("t", "X"));

	}

}
