package com.java.Area_and_perimeterofa_rectangle;

import java.util.Scanner;

public class Area_and_perimeter_of_a_rectangle {
	/*
	 * Get Length and width of rectangle from user. Write a class Rectangle with
	 * getter/setter methods and methods to calculate area and perimeter. Write a
	 * method to calculate perimeter of rectangle using formula: Area = length *
	 * width Perimeter = 2 * (length + width)
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float length, width;

		Scanner input = new Scanner(System.in);

		System.out.println("Please Enter length");

		length = input.nextFloat();

		System.out.println("Please Enter Width");

		width = input.nextFloat();

		Rectangle obj = new Rectangle(length, width);

//	obj.rectangleArea();
//	obj.perimeter();

		System.out.println("Rectangel Area is : " + obj.rectangleArea());
		System.out.println("Perimeter is : " + obj.perimeter());

		input.close();

	}

}
