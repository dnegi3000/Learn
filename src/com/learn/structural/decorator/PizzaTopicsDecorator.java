package com.learn.structural.decorator;

public abstract class PizzaTopicsDecorator implements Pizza{
	
	Pizza  pizzaBase;
	
	@Override
	public double cost() {
		
		return .5;
	}
	
	@Override
	public String descrtiption() {
		
		return "decorator";
	}
	
}
