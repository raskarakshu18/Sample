package com.java.Level_1;

public class Print_pyramid_pattern_using_for_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * To print triangle shape using for loop.
		 */

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5 - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("+ ");
			}
			System.out.println();
			
			
		}

	}

}
