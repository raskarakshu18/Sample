package com.java.String;

public class Remove_HTML_Tags_from_Text {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * It’s a common scenario of getting HTML text from the database to be displayed
		 * in a text box, without the HTML tags. In this case, we need to remove the
		 * HTML tags. Write a program to remove the HTML tags from the following string:
		 * <B>Planning phase for the Project 101023/N is to start from 24-Oct-2016</B>
		 */

		String link = "<B>Planning phase for the Project 101023/N is to start from 24-Oct-2016</B>";

		System.out.println(link);

		String removeHTML = link.replaceAll("\\<.*?\\>", "");

		System.out.println(removeHTML);
	}

}
