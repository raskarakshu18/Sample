package com.java.String;

public class Print_index_of_specific_character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * indexOf(int ch): Returns the index of first occurrence of the specified
		 * character ch in the string.
		 * 
		 * indexOf(int ch, int fromIndex): Same as indexOf method however it starts
		 * searching in the string from the specified fromIndex.
		 * 
		 * lastIndexOf(int ch): It returns the last occurrence of the character ch in
		 * the string.
		 * 
		 * lastIndexOf(int ch, int fromIndex): Same as lastIndexOf(int ch) method, it
		 * starts search from fromIndex. indexOf(String str): This method returns the
		 * index of first occurrence of specified substring str. lastindexOf(String
		 * str): Returns the index of last occurrence of string str. Write a program to
		 * find the index of “A”, position of ‘a’ from the 7th position, position of ‘a’
		 * and position of ‘n’ from the 3rd position.
		 */

		String statement = "I am Kiran Jadhav software Tester";

		System.out.println(statement);

		System.out.println(statement.indexOf('a'));

		System.out.println(statement.indexOf(2, 'a'));

		System.out.println(statement.lastIndexOf('a'));

		System.out.println(statement.lastIndexOf('a', 4));

		System.out.println(statement.lastIndexOf("Tester"));

	}

}
