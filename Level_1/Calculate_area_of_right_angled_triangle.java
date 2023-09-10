package com.java.Level_1;

import java.util.Scanner;

public class Calculate_area_of_right_angled_triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Get height and base of right angled triangle from user. Write a method to
		 * calculate area of triangle using formula: Area = (base*height)/2
		 * 
		 */

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter height of right angled triangle");

		float height = input.nextFloat();

		System.out.println("Please enter base of right angled triangle");

		float base = input.nextFloat();

		double area = (height * base) / 2;

		System.out.println("The area of right angled triangle is : " + area);

		input.close();

	}

}
