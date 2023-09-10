package com.java.Level_1;

import java.util.Scanner;

public class Mathematical_userInput {

	Scanner input = new Scanner(System.in);
	int c;
	double d;

	public void math() {
		System.out.println("Please Enter Integer Number");
		int a = input.nextInt();
		c = a;
		System.out.println("The Integer number enter by user : " + a);
		System.out.println("Please Enter Double Number");
		double b = input.nextDouble();
		d = b;
		System.out.println("The double number enter by user: " + b);
	}

	public void print() {
		double result;
		result = c + d;
		System.out.println("Addtion in print : " + result);
		result = d - c;
		System.out.println("Sub in print : " + result);
		result = c * d;
		System.out.println("Mul in print : " + result);
		result = d / c;
		System.out.println("Div in print : " + result);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double result;
		Mathematical_userInput obj = new Mathematical_userInput();

		System.out.println("Please Enter Integer Number");
		int a = obj.input.nextInt();
		System.out.println("The Integer number enter by user : " + a);
		System.out.println("Please Enter Double Number");
		double b = obj.input.nextDouble();
		System.out.println("The double number enter by user: " + b);
		result = a + b;
//		System.out.println("Addition : "+result);
		System.out.println("addition :" + (result = a + b));
		result = b - a;
//		System.out.println("Sub : "+result);
		System.out.println("Sub : " + (result = b - a));
		result = a * b;
//		System.out.println("Mul : "+result);
		System.out.println("Mul : " + (result = a * b));
		result = b / a;
//		System.out.println("Div : "+result);
		System.out.println("Div : " + (result = b / a));

		System.out.println("---------------Print via method-----------------");

		obj.math();
		obj.print();

	}

}
