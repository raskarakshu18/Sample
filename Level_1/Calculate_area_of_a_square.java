package com.java.Level_1;

import java.util.Scanner;

public class Calculate_area_of_a_square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Please provide side of your room");
		double side = input.nextDouble();
		System.out.println("side : " + side);

		double area = side * side;
		System.out.println("Your total area is :" + area + "ft");

		System.out.println("------------Currency convertor---------------");
//		System.out.println("Exchange Rate dated on 15, April, 2023 1 USD to 81.85 INR");

		double exchangeRate = (1 / 81.85);

		System.out.println("Customer want to exchange INR into USD currency");
		System.out.println("Ask customer provide total amount of INR :" + "\nPlease provide your total amount");
		int amountINtoINR = input.nextInt();
		System.out.println(amountINtoINR);

		double amountIntoUSD = exchangeRate * amountINtoINR;
		System.out.println("Conveted amount in USD is : " + amountIntoUSD);

		input.close();

	}

}
