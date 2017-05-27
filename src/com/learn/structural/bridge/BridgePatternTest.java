package com.learn.structural.bridge;

public class BridgePatternTest {

	
	public static void main(String[] args) {
		
		Triangle  yellowTriangle = new Triangle(new Yellow());
		yellowTriangle.applyColor();
		Triangle  redTriangle = new Triangle(new Red());
		redTriangle.applyColor();
		
		Pentagon  yellowPentgon = new Pentagon(new Red());
		yellowPentgon.applyColor();
		
		Pentagon redPentagon = new Pentagon(new Yellow());
		redPentagon.applyColor();
		
	}
}
