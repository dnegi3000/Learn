package com.learn.creational.singleton;

public class SingletonMain {
	
	
public static void main(String[] args) {
	
	System.out.println("Main method ...........");
	
	Singleton  singleto = Singleton.getSingleton();
	singleto.setName("First");

	Singleton  singleTwo = Singleton.getSingleton();
	
	singleTwo.setName("Second");

	System.out.println(singleto);

	System.out.println(singleTwo);
	
}

}
