package com.java.Level_1;

import java.util.Scanner;

public class Reversing_a_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Write a program to reverse a number e.g. print 4321 to reverse 1234.
		 */

		Scanner input = new Scanner(System.in);

		System.out.println("Please Enter any Integer Number");

		int inputFromUser = input.nextInt();

		String str = String.valueOf(inputFromUser);

//		System.out.println("Original input from user : " + str);

		String reversing = "";

		for (int i = str.length() - 1; i >= 0; i--) {

			reversing = reversing + str.charAt(i);

		}

		System.out.println("Original Value : " + str);
		System.out.println("Reversal Value : " + reversing);

		System.out.println("-----input reverv via String Buffer-------------");

		StringBuffer stringBuffer = new StringBuffer(str);

		System.out.println("Reversal Original value : " + stringBuffer.reverse());

		System.out.println("---------Ohter via to print-----------");
		int n = 1234;
		int reverse = 0;
		while (n != 0) {
			reverse = reverse * 10;
			reverse = reverse + n % 10;
			n = n / 10;
		}
		System.out.println("Reversed number is " + reverse);

	}

}
