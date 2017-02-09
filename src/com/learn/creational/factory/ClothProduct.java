package com.learn.creational.factory;

public class ClothProduct extends Product{

	private ClothProduct(){
		
	}
	static 
	{
		System.out.println("Static block Cloth product");
		Factory.registerProduct("ClothProd",new ClothFactory());	
	}
	
	@Override
	public ClothProduct createProduct() {
		
		return new ClothProduct();
	}
	
	
	static class ClothFactory extends Factory{

		static {
			
			Factory.registerProduct("ClothProd", new ClothFactory() );
		}
		@Override
		public Product getInstance() {
			
			return new ClothProduct();
		}
		
		
	}

	
	
}
