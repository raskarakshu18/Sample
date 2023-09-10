package com.java.Level_1;

import java.util.Scanner;

public class Welcome_msg_scannerClass {

	Scanner userinput = new Scanner(System.in);

	public void student() {
		System.out.println("Please Enter your first Name");
		String firstName = userinput.next();
		System.out.println("Please Enter your first Name");
		String lastName = userinput.next();
		System.out.println(firstName);
		System.out.println(lastName);
	}

	public static void welcomeMsg() {
		System.out.println("Welcome to Java project");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		welcomeMsg();

		Welcome_msg_scannerClass obj = new Welcome_msg_scannerClass();

//		obj.student();
		System.out.println("Please Enter Your first Name");
		String firstName = obj.userinput.next();
		System.out.println("Please Enter Your Last Name");
		String lastName = obj.userinput.next();
		welcomeMsg();
		System.out.println(firstName + " " + lastName);

//		System.out.println(lastName);
		
		obj.userinput.close();
		
	}

}
