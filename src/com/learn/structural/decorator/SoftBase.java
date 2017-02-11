package com.learn.structural.decorator;

public class SoftBase implements Pizza{

	@Override
	public double cost() {
		
		return 100;
	}

	@Override
	public String descrtiption() {
		
		return " -->  Pizza Basic ------- \n ";
	}

	
}
