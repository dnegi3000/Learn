package com.learn.structural.bridge;

public abstract class Shape {

	protected Color color ;
	
	public Shape(Color pColor )
	{
		this.color = pColor;
	}
	
	abstract public void applyColor();
}
