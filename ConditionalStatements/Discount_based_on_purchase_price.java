package com.java.ConditionalStatements;

import java.util.Scanner;

public class Discount_based_on_purchase_price {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * During a sale at a store, a 10% discount is applied to purchases over INR
		 * 10000.00. Write a program that asks for the amount of a purchase, then
		 * calculates the discounted price. The purchase amount will be input in INR (as
		 * an integer):
		 */

		int pricePerUnit = 1;

		Scanner input = new Scanner(System.in);

		System.out.println("Please Enter your purchase amount");

		int purchaes = input.nextInt();

		int discount = (purchaes * 10) / 100;// 10% discount

		int billPayable = purchaes * pricePerUnit;

		if (billPayable >= 10000) {
			int amountAfterDiscount = billPayable - discount;
			System.out.println("Your are applicable for discount");
			System.out.println("Your bill before discount is : " + billPayable);
			System.out.println("Your total Bill after discount payable amount is : " + amountAfterDiscount);
		} else {
			System.out.println("You are not applicable for discount");
			System.out.println("Your total Bill payable amount is : " + billPayable);
		}
		
		input.close();

	}

}
