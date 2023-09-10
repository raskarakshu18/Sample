package com.java.Level_1;

import java.util.Scanner;

public class Program_to_calculate_BMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Get user input for height and weight in inches and kg respectively. Calculate
		 * BMI (body mass index) using formula: bmi = weight / (height*height)
		 * 
		 */
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please Enter your height inches :");
		
		float height = input.nextFloat();
		
		System.out.println("Please Enter Your weight KG : ");
		
		int weight = input.nextInt();
		
		double bmi= weight/(height*height);
		
		System.out.println("Your BMI (body mass index) is : "+bmi);

		
//		System.out.println("Welcome to BMI Calculator");
//		System.out.println("=======================");
//		System.out.print("Enter height in inches: ");
//		double height = input.nextDouble();
//		height = height * 0.0254;
//		System.out.print("Enter weight in kg: ");
//		double weight = input.nextDouble();
//		double bmi;
//		bmi = weight / (height*height);
//		System.out.print("BMI is: " + bmi);
//		input.close();
	}

}
