package com.java.Level_1;

import java.util.Scanner;

public class Cube_root_of_a_given_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Math.cbrt - Math class in Java has function to calculate Cube root. Write a
		 * program to calculate the cube root of a number, entered by user
		 */

		Scanner input = new Scanner(System.in);

		System.out.println("Please Enter any cube root of number");

		int cubeNumber = input.nextInt();

		if (cubeNumber % Math.cbrt(cubeNumber) == 0) {
			System.out.println("Cube Number is : " + cubeNumber + ", root is : " + Math.cbrt(cubeNumber));

		} else {
			System.out.println("Please Enter vaild Cube root Number");
			System.out.println("!!!!!!Exit");
		}

		input.close();
	}

}
