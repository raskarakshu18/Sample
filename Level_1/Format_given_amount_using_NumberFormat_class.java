package com.java.Level_1;

import java.text.NumberFormat;
import java.util.Scanner;

public class Format_given_amount_using_NumberFormat_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Write a program to accept amount as input from user and format it as currency
		 * using NumberFormat class java.text.NumberFormat //import NumberFormat class
		 * to use in program
		 */

		Scanner input = new Scanner(System.in);

		System.out.println("Please Enter any amount");
		double currency = input.nextDouble();

		NumberFormat convert = NumberFormat.getPercentInstance().getCurrencyInstance();

//		NumberFormat obj = NumberFormat.getPercentInstance();

//		Object o = obj.getCurrency();
//		System.out.println(o);

		String uSD = convert.format(currency);

		System.out.println(convert.getCurrency() + " " + uSD);
		
//		char a = input.next().

		input.close();
		

	}
}
