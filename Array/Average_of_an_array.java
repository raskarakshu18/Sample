package com.java.Array;

import java.text.DecimalFormat;

public class Average_of_an_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Write a program to find the average of stock prices of a stock recorded over
		 * the last 7 days.
		 */

		DecimalFormat decimal = new DecimalFormat();
		
		double[] list = { 10.12, 12.12, 50.25 };

		double sum = 0;

		double average;

		int lenght = list.length;

		for (int i = 0; i < lenght; i++) {
			sum = sum + list[i];
		}

		average = sum / lenght;

		System.out.println("The average of list is : " +decimal.format(average));

	}

}
