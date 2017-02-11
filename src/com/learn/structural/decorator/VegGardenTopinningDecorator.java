package com.learn.structural.decorator;

public class VegGardenTopinningDecorator extends PizzaTopicsDecorator{
	
	public VegGardenTopinningDecorator(Pizza  pizza) {
	
		this.pizzaBase = pizza;
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 67 + pizzaBase.cost();
	}
	
	@Override
	public String descrtiption() {
		
		return pizzaBase.descrtiption() +  "Added :: Vegetables   :-) ";
	}
	
	
}
