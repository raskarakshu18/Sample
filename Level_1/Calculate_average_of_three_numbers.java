package com.java.Level_1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Calculate_average_of_three_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Get three numbers from user. Calculate average of the three numbers using
		 * formula: Average = (num1 + num2 + num3) / 3
		 * 
		 */

		DecimalFormat decimal = new DecimalFormat();
		Scanner input = new Scanner(System.in);

		System.out.println("Please Enter any 3 Number");

		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();

		double average = (a + b + c) / 3;

		System.out.println("The Aveerage is : " + decimal.format(average));

		input.close();
	}

}
