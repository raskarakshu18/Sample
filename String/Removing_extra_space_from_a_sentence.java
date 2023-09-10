package com.java.String;

import java.util.StringTokenizer;

public class Removing_extra_space_from_a_sentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Write a program to remove extra spaces from text. Use the sentence used in
		 * the previous case is as shown below: Planning phase for the Project 101023/N
		 * is to start from 24-Oct-2016
		 */

		String name = "  My name   is  kiran   jadhav    ";

		System.out.println("Original String");
		System.out.println(name);

		StringTokenizer str = new StringTokenizer(name, " ");

		StringBuffer result = new StringBuffer();

		while (str.hasMoreElements()) {
			result.append(str.nextElement()).append(" ");
		}
		
		System.out.println("After remove extra spaces");

		System.out.println(result.toString().trim());

	}

}
