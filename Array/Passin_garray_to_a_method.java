package com.java.Array;

public class Passin_garray_to_a_method {

	public static void print(int[] arr) {
		for (Object a : arr) {
			System.out.println(a);
		}
	}

	public static void print(String[] arr) {
		for (String a : arr) {
			System.out.println(a);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] number = { 10, 20, 30, 40, 50 };

		String[] name = { "Kiran", "KJ", "Jadhav", "Karan" };

		System.out.println("--------Integer Array----------------");

		print(number);

		System.out.println("-----------------String Array------------------");

		print(name);

	}

}
