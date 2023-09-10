package com.java.Level_1;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.println("Please Enter Your Name: ");
		String name = input.next();
		
		System.out.println("Pleasen enter Your Age : ");
		int Age = input.nextInt();
		
		System.out.println("Please Enter Your Height : ");
		float Height = input.nextFloat();
		
		System.out.println("Please Enter Your Blood Group : ");
		String Blood_Group = input.next();
		
		System.out.println("Please Enter Your Salaray in INR : ");
		long Salary = input.nextLong();
		
		System.out.println("Please Enter Your DOB : ");
		String DOB = input.next();
		
		
		System.out.println("\n--------------------Form---------------");
		
		System.out.println("Name :"+name+"\nAge : "+Age+"\nHeight :"+Height+"\nBlood Group :"
		+Blood_Group);
		input.close();
		
		input.close();

	}

}
