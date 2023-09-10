package com.java.Exception;

public class Exception_Handling_in_Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Write a program to handle divide by zero error (dividing a number by zero)
		 * and catching the exception to report an error
		 */

		int a=100, b=0;
		
		try {
			System.out.println(a/b);	
		}
		catch(ArithmeticException e) {
//			System.out.println("You can not devided with Zero");
			System.out.println(e.getMessage());
			System.out.println(e.getLocalizedMessage());
			System.out.println(e.getCause());
			System.out.println(e.getSuppressed());
			System.out.println(e.toString());
			System.out.println(e.getStackTrace());
			System.out.println(e.equals(0));
		
		}
	}

}
