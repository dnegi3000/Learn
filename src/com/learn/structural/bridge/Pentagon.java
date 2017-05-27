package com.learn.structural.bridge;

public class Pentagon extends Shape{
	
	public Pentagon(Color c) {
		super(c);
	}
	@Override
	public void applyColor() {
		System.out.println("Pentagon with Color .........");
		color.applyColor();
	}

}
