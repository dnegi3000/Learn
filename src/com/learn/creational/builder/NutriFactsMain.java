package com.learn.creational.builder;

public class NutriFactsMain {
	
	public static void main(String[] args) {
		
		NutritionFacts nutri = new NutritionFacts.Builder(20 ,10).calories(20).carbohydrate(30).fat(30).build();
		System.out.println(nutri);
		
		
		
	}

}
