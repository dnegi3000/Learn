package com.learn.structural.bridge;

public class Triangle extends Shape{

	public Triangle(Color pColor) {
		super(pColor);
	}

	@Override
	public void applyColor() {
		System.out.println("Pentagon with Color .........");
		color.applyColor();
	}

}
