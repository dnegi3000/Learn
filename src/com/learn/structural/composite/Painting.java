package com.learn.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Painting implements Shape{
	
	List<Shape> shapes = new ArrayList<Shape>();
	
	
	@Override
	public void draw(String fillColor) {
	
		for(Shape s : shapes ){
			s.draw(fillColor);
		}
	}
	
	
	public void add(Shape s) {
		this.shapes.add(s);
		
	}
	
	public void remove(Shape s ){
		this.shapes.remove(s);
	}


	public void clear() {
		this.shapes.clear();
		
	}
	
	
}
