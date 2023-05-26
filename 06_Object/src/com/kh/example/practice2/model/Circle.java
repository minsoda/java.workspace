package com.kh.example.practice2.model;

public class Circle {
	
	public final static double PI = 3.14; //대문자. 상수가 되기때문에 final + static 붙여줌
	public int radius = 1;
	

	public void incrementRadius() {
		++radius;
	}
}

