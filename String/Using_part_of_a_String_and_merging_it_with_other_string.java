package com.java.String;

import java.util.Scanner;

public class Using_part_of_a_String_and_merging_it_with_other_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Write a program to take out “Techcanvass” from the string “Techcanvass
		 * Academy" and add “Mumbai” as suffix to it with space. The output should be as
		 * shown below
		 */

		Scanner input = new Scanner(System.in);

		System.out.println("Please Enter any word");

		String name = input.next();

		System.out.println("Please Enter secound word");

		String nameSecound = input.next();

		String word = name + (nameSecound);

		System.out.println(word);

		System.out.println(word.substring(0, 7).concat(" Pune"));

		input.close();

	}

}
