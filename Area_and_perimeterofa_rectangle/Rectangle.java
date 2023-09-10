package com.java.Area_and_perimeterofa_rectangle;

import java.util.Scanner;

public class Rectangle {

	private float length;
	private float width;

	public Rectangle(float length, float width) {
		this.length = length;
		this.width = width;
	}

	public void setterLength(float length) {

		this.length = length;
	}

	public float getterLength() {
		return length;
	}

	public void setterWidth(float width) {

		this.width = width;
	}

	public float getterWidth() {
		return width;
	}

	public float rectangleArea() {
		float area = length * width;
		return area;

	}

	public float perimeter() {
		float perimeter = 2 * (length + width);
		return perimeter;
	}

}
