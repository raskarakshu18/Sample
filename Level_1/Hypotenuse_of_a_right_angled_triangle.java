package com.java.Level_1;

import java.util.Scanner;

public class Hypotenuse_of_a_right_angled_triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * A hypotenuse is the longest side of a right-angled triangle, the side
		 * opposite the right angle. The length of the hypotenuse of a right triangle
		 * can be found using the Pythagorean Theorem, which states that the square of
		 * the length of the hypotenuse equals the sum of the squares of the lengths of
		 * the other two sides. Math.hypot - Math class in Java has function to
		 * calculate hypotenuse. Write a program to find the hypotenuse of a
		 * right-angled triangle.
		 * 
		 * 
		 */

		Scanner input = new Scanner(System.in);

		System.out.println("Please Enter the one side of right angled triangle");

		int oneSide = input.nextInt();

		System.out.println("Please Enter the second side of right angled triangle");

		int secondSide = input.nextInt();

		int square = (oneSide * oneSide) + (secondSide * secondSide);

		System.out.println("one side square + second side square = hypotenuse square : " + square);

		double hypotenus = Math.sqrt(square);

		System.out.println("Hypotenus : " + hypotenus);

		System.out.println("Formula Math.hypot : " + Math.hypot(oneSide, secondSide));

		input.close();
	}

}
