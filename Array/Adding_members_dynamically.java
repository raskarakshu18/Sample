package com.java.Array;

public class Adding_members_dynamically {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Write a program to add members in an array dynamically. Add multiples of 5 to
		 * an array starting from 10 and ending at 35.
		 */

		int array_size = (((35 - 10)) / 5) + 1;

		System.out.println(array_size);

		int[] arr = new int[array_size];
		for (int i = 0; i < array_size; i++) {

			arr[i] = 10 + (5 * i);

		}
		for (int a : arr) {
			System.out.println(a);
		}

	}

}
