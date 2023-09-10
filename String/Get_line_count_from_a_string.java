package com.java.String;

public class Get_line_count_from_a_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Write a program to get line count from a string. Hint: Assuming that we have
		 * read a string and have stored it in a string. We are using String.split()
		 * method with the use of regular expression [\n|\r]. It will split the string
		 * based on the new line char and carriage return char. After the split, we will
		 * get string array, and returning length of the array.
		 */

		String line = "Write\n a program\n to get line\r count\n from a string\r Hind : ";

		System.out.println(line);

//		System.out.println(line.split("[\n\r]".length()));

		int linecount = linecount(line);
		System.out.println("Total line : " + linecount);

	}

	public static int linecount(String line) {
		return line.split("[\n\r]").length;
	}

}
