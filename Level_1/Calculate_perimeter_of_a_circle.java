package com.java.Level_1;

import java.util.Scanner;

public class Calculate_perimeter_of_a_circle {
	
	Scanner input = new Scanner(System.in);
	int radius;
	public void input() {
		
		System.out.println("Please Enter your circle aradius");
		int a = input.nextInt();
		System.out.println("Radius is : "+a);
		radius = a;
		
		
	}
	public void perimeter() {
		float perimeter = (float) (2*Math.PI*(radius));
		System.out.println("Perimeter is : " +perimeter);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculate_perimeter_of_a_circle run = new Calculate_perimeter_of_a_circle();
		run.input();
		run.perimeter();
	}

}
