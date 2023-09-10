package com.java.Level_1;

public class Program_to_find_sum_of_Digits_of_a_given_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * To find sum of digits means add all the digits of that number. For example:
		 * Number: 734 Sum of all digits is 7 + 3 + 4 = 14 Write a program to calculate
		 * the sum of its digits
		 */

		int number = 734;
		int sum = 0;
		int r;

		int num = number;

		while (num != 0) {

			sum = sum + num % 10;

			num = num / 10;

		}

		System.out.println(sum);
		
		test();

	}
	
	public static void test() {
	int a = 1234;
	
	int b = a;
	int sum =0;
	int r;
	while(b!=0) {
		r = b%10;
		sum = (sum*10)+r;
//		sum = sum+b%10;
		b = b/10;
		
	}
	System.out.println(sum);
	}

}
