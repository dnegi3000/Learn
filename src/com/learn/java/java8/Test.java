package com.learn.java.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.sun.xml.rpc.processor.generator.Names;

public class Test {

	
	public static void main(String[] args) {
		List<String> names = Arrays.asList("abc","bca","aa","deepakj", "amy");
		System.out.println(names.stream());	
		
	}
}
