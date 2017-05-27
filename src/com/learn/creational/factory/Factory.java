package com.learn.creational.factory;

import java.util.HashMap;
import java.util.Map;
/**
 * 
 * 
 * This is kind of a Abstract factory 
 * @author dnegi
 *
 */
public abstract class Factory {
	
	//private static Factory instance = new Factory();
	
	private static Map<String,Factory> 	products = new HashMap<String, Factory>();
	
	
 public abstract  Product getInstance();
 
 public  static void registerProduct(String pId , Factory pFactory){
	 
	products.put(pId, pFactory);
	System.out.println("inside register product ");
 }
	
 public static Factory getProduct(String pId){
	 System.out.println("inside ..................");
	 return products.get(pId);
 }
}

