package com.learn.structural.decorator;

public class DecoratorMain {
	
public static void main(String[] args) {

	Pizza   firstPizzaOrder = new SoftBase();
	
	firstPizzaOrder       = new ExtraCheeseDecorator(firstPizzaOrder);
	firstPizzaOrder   = new VegGardenTopinningDecorator(firstPizzaOrder);
	
	
	System.out.println("this is the " + firstPizzaOrder.descrtiption());
	firstPizzaOrder   = new VegGardenTopinningDecorator(firstPizzaOrder);
	System.out.println(firstPizzaOrder.descrtiption());
	
	
	
}

}
