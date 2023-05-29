package com.kh.pratice.controller;

import com.kh.pratice.model.Circle;

public class CircleController {

	private Circle c = new Circle();
	
	public String calcArea(int x, int y, int radius) {
		
		
		//면적 :PI * 반지름 * 반지름
		c.setRadius(radius);
		c.setX(x);
		c.setY(y);
		
		return c.draw() + "/ " + Math.PI * radius * radius;
	
	}
	
	public String calcCircum(int x, int y, int radius) {
		
		c.setRadius(radius);
		c.setX(x);
		c.setY(y);
		
		return c.draw() + "/ "  + Math.PI * radius * 2;
	}
}
