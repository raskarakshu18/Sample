package com.java.Exception;

public class Array_Exception_Handling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Write a program to handle the exception caused accessing elements, which are
		 * not there in the array int[] array1 = {1,2,3,4} Write a program to catch the
		 * exception, when you try to access array1[4], which is the 5th element.
		 * 
		 */

		int[] array1 = { 10, 20, 30, 40 };

		try {
			System.out.println("accessing Array1 : " + array1[4]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			System.out.println("Array Index out of Bounds Exception");
		}

	}

}
