package com.learn.java.java8.defaultmethinterface;

interface DefaultMethodInterface {

	double method();
	
	default double method(double in){
		
		return Math.sqrt(in);
	}
	
	
	
}
