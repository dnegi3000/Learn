package com.learn.creational.factory;

import com.learn.creational.factory.ClothProduct.ClothFactory;

public class main {

	
	/**
	 * Factory Method
	 * Purpose
		Exposes a method for creating objects, allowing subclasses to control the actual creation process.
		
		
		Polymorphic Factory method .
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		ClothFactory fac = (ClothFactory) ClothFactory.getProduct("ClothProd");
		System.out.println("factory " + fac);
		
		ClothProduct cp =  (ClothProduct) fac.getInstance();
		System.out.println("cp" + cp);
		
		ClothProduct   cp2= (ClothProduct) fac.getInstance();
		
		System.out.println("Cloth prod1"  + cp);
		
		System.out.println("Cloth prod2"  + cp2);
		
	}
}
