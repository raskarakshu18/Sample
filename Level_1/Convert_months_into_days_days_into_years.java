package com.java.Level_1;

import java.util.Scanner;

public class Convert_months_into_days_days_into_years {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Write a program to convert given no. of months into days. Also convert days
		 * (entered by user) into years (it could be decimal value also).
		 */

		Scanner input = new Scanner(System.in);

		System.out.println("Please Enter the Number of Month : ");

		int month = input.nextInt();

		double days = month * 30;

		System.out.println("Total Days in months :" + month + ", " + days);

		double year = days / 365;

		System.out.println("No of Year : " + year);

		input.close();
		
//		System.out.println("Enter months for conversion : ");
//		int month = userInput.nextInt();
//		 System.out.println("Enter days for conversion into year : ");
//		int days = userInput.nextInt();
//		int days2 = month * 30;
//		double years = (double) days / 365;
//		 
//		System.out.println(month +" months = "+days2+" days");
//		 System.out.println(Days +" Days = "+years+" years");
//		
	}

}
