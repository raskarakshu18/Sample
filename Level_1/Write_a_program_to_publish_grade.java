package com.java.Level_1;

import java.util.Scanner;

public class Write_a_program_to_publish_grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Write a program to publish the grade of a students in science based on marks
		 * in physics, chemistry and biology papers as per following plan:  If marks in
		 * all three subjects equal to or greater than 90 (out of Hundred), grade is A++
		 *  If marks in all three subjects greater than & equal to 80 and less than 90
		 * (out of Hundred), grade is A+  If marks in all three subjects greater than &
		 * equal to 70 and less than 80 (out of Hundred), grade is A  For everyone
		 * else, the grade is B. It’s advisable to build the algorithm first. Check the
		 * next page for the solution.
		 * 
		 */

		Scanner input = new Scanner(System.in);

		System.out.println("Please Enter Student Name");
		String studentName = input.nextLine();

		System.out.println("Please Enter physics mark");
		int physics = input.nextInt();

		System.out.println("Please Enter chemistry mark");
		int chemistry = input.nextInt();

		System.out.println("Please Enter biology mark");
		int biology = input.nextInt();

		int totalMark = physics + chemistry + biology;

		System.out.println("Student Name " + studentName + " Total Mark is : " + totalMark);

		int prasentage = (totalMark * 100) / 300;

		System.out.println("Student : " + prasentage + "%");

		if (prasentage >= 90 || prasentage >= 100) {
			System.out.println("Student Name : " + studentName + " Grade is : A++");
		} else {

			if (prasentage >= 80 || prasentage > 90) {
				System.out.println("Student Name : " + studentName + "Grade is : A+");
			} else {

				if (prasentage >= 70 || prasentage > 80) {
					System.out.println("Student Name : " + studentName + " Grade is : A");
				} else {

					if (prasentage >= 60) {
						System.out.println("Student Name : " + studentName + "Grade is : B");
					} else 
						if (prasentage >= 35) {
							System.out.println("Student Name : " + studentName + "Grade is : Pass ");
						} else 
						

						if (prasentage < 100 || prasentage <35) {
							System.out.println("Student Mark not vaild");
							System.out.println("Exist");
						}
					}
				}
			}
		

//		System.out.print("Enter the name of the student:");
//		String student_name = input.next();
//		System.out.print("Enter the marks in Physics:");
//		int p_marks = input.nextInt();
//		System.out.print("Enter the marks in Chemistry:");
//		int c_marks = input.nextInt();
//		System.out.print("Enter the marks in Biology:");
//		int b_marks = input.nextInt();
//		
//		
//		if (p_marks >= 90 && c_marks >= 90 && b_marks >= 90) {
//			System.out.println("Grade of " + student_name + " is " + "A++");
//		} else {
//			if (p_marks >= 80 && c_marks >= 80 && b_marks >= 80) {
//				{
//					System.out.println("Grade of " + student_name + " is " + "A+");
//				}
//			} else {
//				if (p_marks >= 70 && c_marks >= 70 && b_marks >= 70) {
//					{
//						System.out.println("Grade of " + student_name + " is " + "A");
//					}
//				} else {
//					System.out.println("Grade of " + student_name + " is " + "B");
//				}
//			}
//		}

	}
}
