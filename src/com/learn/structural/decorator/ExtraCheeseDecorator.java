package com.learn.structural.decorator;

public class ExtraCheeseDecorator extends PizzaTopicsDecorator{
	
	public ExtraCheeseDecorator(Pizza  pizza) {
	
		this.pizzaBase = pizza;
	}
	
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 50 + pizzaBase.cost();
	}
	
	@Override
	public String descrtiption() {
		
		return pizzaBase.descrtiption() +  "Added :: Extra Cheeze  :-) ";
	}
	
	

}
