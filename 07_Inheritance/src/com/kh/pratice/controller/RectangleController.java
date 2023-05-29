package com.kh.pratice.controller;

import com.kh.pratice.model.Rectangle;

public class RectangleController {

	private Rectangle r = new Rectangle();
	

	public String calcArea(int x, int y, int height, int width) {
		
		//면적 : 너비 * 높이
		r.setHeight(height);
		r.setWidth(width);
		r.setX(x);
		r.setY(y);
		
		return r.draw() + " / " + width * height; // "" + 은 숫자가 문자형으로 인식이 됨.
	}
	
	public String calcPerimeter(int x, int y, int height, int width) {
		
		//둘레 : 2*(너비 + 높이)
		r.setHeight(height);
		r.setWidth(width);
		r.setX(x);
		r.setY(y);
		
		return r.draw() + " / " + 2 * (width + height);
	}
	
}
