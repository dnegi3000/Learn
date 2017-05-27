package com.learn.creational.protoype;

public class MainProto {

	
	public static void main(String[] args) {
		
		ClassToPrototype   p = new ClassToPrototype();
		
		  try {
		ClassToPrototype	p1 = (ClassToPrototype) p.clone();
		
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
