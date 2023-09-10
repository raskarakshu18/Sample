package com.java.String;

public class Find_out_if_a_particular_String_exists_in_given_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * String class contains() method returns true if and only if this string
		 * contains the specified sequence of char values. It’s a case sensitive check.
		 */
		
		String part1 = "SingleLevel inheritanc";
		
		System.out.println("part1 : "+part1);
		
		String part2 = "SingleLevel inheritanc";
		
		String part3 = " SingleLevel  inheritanc";
		
		System.out.println("--------Contains-------------");
		
		System.out.println(part1.contains(part2));
		
		System.out.println(part1.contains(part3));
		
		System.out.println("------contentEquals------------");
		
		System.out.println(part1.contentEquals(part2));
		
		System.out.println(part1.contentEquals(part3));

	}

}
