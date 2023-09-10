package com.java.Array;

import java.util.Iterator;

public class Displaying_array_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] month = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

		for (int i = 0; i < month.length; i++) {
			System.out.println(month[i]);
		}

		System.out.println("-----------Print Advance Loop---------------");

		for (String a : month) {
			System.out.println(a);
		}

	}

}
