package com.java.Level_1;

import java.util.Scanner;

public class Calculate_area_of_a_circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Get radius of circle from user and calculate area of circle using formula:
		 * Area = PI * radius * radius // use Math.PI for value of Pi Math Class is in
		 * java.lang package. Import is not required for classes in java.lang package
		 */

		Scanner userinput = new Scanner(System.in);

		System.out.println("Please Enter radius of circle");

		int radius = userinput.nextInt();

		double area = Math.PI * radius * radius;

		System.out.println("Area of circle is : " + area);

		userinput.close();

	}

}
