package com.java.Level_1;

import java.util.Scanner;

public class Finding_X_powe_Y_without_Math_function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * To calculate N P multiply N, P times. Write a ‘for’ loop to multiply number
		 * N. This loop should execute P times. For example 2 5 = 2*2*2*2*2 = 32
		 */
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please Enter the Number");
		
		int number = input.nextInt();
		
		System.out.println("Please Enter the power/index");
		
		int power = input.nextInt();
		
		int result = 1;
		
		for(int i=0; i<power; i++) {
			result = result *number;
		}
		System.out.println("The power of number : "+"power time : "+result);
	}
}