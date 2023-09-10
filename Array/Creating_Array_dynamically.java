package com.java.Array;

import java.util.Scanner;

public class Creating_Array_dynamically {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Write a program to create and add members in an array dynamically. The
		 * starting member and end number will be provided by the user along with the
		 * number of elements
		 */

		Scanner input = new Scanner(System.in);

		System.out.println("Please Enter the Array size ");

		int size = input.nextInt();

		System.out.println("Please Enter the staring member of array element");

		int staringNumber = input.nextInt();

		System.out.println("Please enter the End member of array element");

		int endNumber = input.nextInt();

		int array_size = (((endNumber - staringNumber)) / size) + 1;

		int[] arrayDynamically = new int[array_size];

		for (int i = 0; i < array_size; i++) {
			arrayDynamically[i] = staringNumber + (5 * i);
		}

		for (int a : arrayDynamically) {
			System.out.println(a);
		}
	}

}
