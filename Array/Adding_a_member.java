package com.java.Array;

public class Adding_a_member {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Write a program to add members in an array. Create an integer array and add
		 * 1,2,3,4 and 5 to the array.
		 */

		int[] number = new int[5];

		try {

			number[0] = 1;
			number[1] = 2;
			number[2] = 3;
			number[3] = 4;
			number[4] = 5;
			number[5] = 6;
			number[6] = 7;
			
		} catch (ArrayIndexOutOfBoundsException e) {

			for (int a : number) {
				System.out.println(a);
			}
		}

	}

}
