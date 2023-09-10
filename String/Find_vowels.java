package com.java.String;

public class Find_vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int vowelscount = 0;

		String name = "My name is Kiran Jadhav software Tester";

		System.out.println(name.toLowerCase());

		for (int i = 0; i < name.length() - 1; i++) {

			if (name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'i' || name.charAt(i) == 'o'
					|| name.charAt(i) == 'u') {

				System.out.println(name.charAt(i) + "  " + i);
				vowelscount++;
			}

		}
		
		System.out.println("Total Vowelscount : "+vowelscount);

	}

}
