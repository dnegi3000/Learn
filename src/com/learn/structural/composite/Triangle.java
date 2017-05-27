package com.learn.structural.composite;

public class Triangle implements Shape{

	@Override
	public void draw(String fillColor) {
		System.out.println("Draw triangle with color " + fillColor);
	}
}
