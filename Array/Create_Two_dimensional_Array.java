package com.java.Array;

import java.util.Scanner;

public class Create_Two_dimensional_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Write a class to create a two-dimensional array of numbers as shown below.
		 * Two-dimensional arrays means that the arrays have multiple rows and columns.
		 * Write a program to create an array as shown below and print the elements 1 3
		 * 5 6 9 8 12 8 5
		 */

		Scanner input = new Scanner(System.in);

		System.out.println("Please Enter the No of Row in the 2D array");

		int row = input.nextInt();

		System.out.println("Please Enter the no of coloum in the 2D array");

		int col = input.nextInt();

		int[][] twoDArray = new int[row][col];

		for (int i = 0; i < twoDArray.length; i++) {
			for (int j = 0; j < twoDArray[i].length; j++) {

				System.out.println("Please Enter the value");

				twoDArray[i][j] = input.nextInt();

			}
			System.out.println(" ");
		}

		for (int i = 0; i < twoDArray.length; i++) {
			for (int j = 0; j < twoDArray[i].length; j++) {

				System.out.print(twoDArray[i][j] + " ");
			}
			System.out.println(" ");
		}

	}

}
