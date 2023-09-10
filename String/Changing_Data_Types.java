package com.java.String;

import java.util.Scanner;

public class Changing_Data_Types {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Write a program to create a sentence using “So, you will be joining the
		 * University in the summer of <Year>”. The Year has to be entered by the user
		 * based on passing of 12th standard. Solution There are two methods to do so.
		 * Java allows automatic change from integer to String as ‘+’ operator is
		 * overloaded in this case. However, there is an alternative method, which is
		 * also shown in the solution using “valueof()” method of String
		 */

		Scanner input = new Scanner(System.in);

		System.out.println("Please Enter Integer number");

		int integer = input.nextInt();

		System.out.println("Please Enter Double number");

		double Double = input.nextDouble();

		System.out.println("Please Enter Float number");

		float Float = input.nextFloat();

		System.out.println("Please Enter Long number");

		long longs = input.nextLong();

		System.out.println("Please Enter Integer number");

		int valueof = input.nextInt();

		String str = String.valueOf(integer);
		System.out.println(str);

		System.out.println(str.valueOf(Double));
		System.out.println(str.valueOf(Float));
		System.out.println(str.valueOf(longs));

	}

}
