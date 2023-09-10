package com.java.Level_1;

public class Handling_decimal {

	public void floatNumber() {
		float numberOne = 10.5f, numbertwo = 20.5f, numberThree = 100.5f, result;

		result = numberOne + numbertwo + numberThree;
		System.out.println("Addition : " + result);
		System.out.println("Sub : " + (result = numberOne - numbertwo - numberThree));

		System.out.println("Addition & Sub : " + (numberOne + numbertwo - numberThree));
	}

	public void floatdouble() {
		float numberOne = 10.5f, numberThree = 20.5f;
		double numbertwo = 20.5542, result;

		result = numberOne * numbertwo * numberThree;
		System.out.println("Mul : " + result);
		System.out.println("Div : " + (result = numberOne / numbertwo / numberThree));

		System.out.println("Mul & Div : " + (numberOne / numbertwo * numberThree));

		System.out.println("Mul & Div : " + (numberOne / numbertwo * (numberThree)));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Handling_decimal obj = new Handling_decimal();

		obj.floatNumber();
		obj.floatdouble();
		System.out.println("-----------Main method veriable---------------");

		float floatnumuber = 5.2f;
		double doublenumber = 10.25;
		double dou;
		float flo;
		flo = (float) (floatnumuber + doublenumber);
		System.out.println("Addition : " + "Explicit : " + flo);
		dou = floatnumuber + doublenumber;
		System.out.println("Addition : " + "Implicit : " + dou);

		flo = (float) (floatnumuber * doublenumber);
		System.out.println("Mul : " + "Explicit : " + flo);
		dou = (floatnumuber * doublenumber);
		System.out.println("Mul : " + "Implicit :" + dou);

		flo = (float) (floatnumuber / doublenumber);
		System.out.println("Div : " + "Explicit : " + flo);
		dou = (floatnumuber / doublenumber);
		System.out.println("Addition : " + "Implicit :" + dou);

		flo = (float) (floatnumuber - doublenumber);
		System.out.println("Sub : " + "Explicit : " + flo);
		dou = (floatnumuber - doublenumber);
		System.out.println("Sub : " + "Implicit :" + dou);
	}

}
