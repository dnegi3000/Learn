package com.learn.structural.composite;

public class CompositeTestClient {

	public static void main(String[] args) {

		Painting    painting = new Painting();
		painting.add(new Circle());
		painting.add(new Triangle());
		painting.add(new Circle());
		painting.add(new Triangle());
		painting.add(new Triangle());
		painting.add(new Triangle());
		
		painting.draw("Yellow");
		painting.draw("Red");
		painting.clear();
		
		
		
		
	}
}
