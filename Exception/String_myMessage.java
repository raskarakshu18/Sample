package com.java.Exception;

public class String_myMessage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Write a program to handle the exception caused by the following lines of
		 * code…. String myMessage = null; System.out.println(myMessage.length())
		 */

		String myMessage = null;

		try {
			System.out.println(myMessage.length());
		} catch (NullPointerException e) {
			System.out.println("Null Pointer Exception");
		}

	}

}
