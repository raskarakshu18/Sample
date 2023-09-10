package com.java.Array;

import java.util.Scanner;

public class Search_in_an_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Write a program to search a number in an array. In the previous program, we
		 * had created an array having stock prices for a stock for last 1 week. A user
		 * may want to know if the stock prices was at some level on any of the days……
		 * The stock prices are 102.45, 109.87, 100.23, 109.23, 102.45,103.67, 105.67
		 * 
		 */

		double[] stockPrices = { 102.45, 109.87, 100.23, 109.23, 102.45, 103.67, 105.67 };

		boolean match = false;

		Scanner input = new Scanner(System.in);
		System.out.println("Please Enter the any Stock Prices");

		double searchStockPrice = input.nextDouble();

		for (int i = 0; i < stockPrices.length; i++) {
			if (stockPrices[i] == searchStockPrice) {
//				System.out.println("You have search stokc price is avaiable in the list");
				match = true;
			}

		}
//		System.out.println("You have search stokc price is avaiable in the list");
		if (match == false) {
			System.out.println("Your Stock price is not avaiable : " + searchStockPrice);
		} else {
			System.out.println("You have search stokc price is avaiable in the list");
		}

	}

}
