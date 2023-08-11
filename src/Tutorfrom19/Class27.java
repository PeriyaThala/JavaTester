package Tutorfrom19;

public abstract class Class27 { // for abstract methods the main class also to be in abstract *******
	
	public abstract void drawShape(); // abstract methods cannot have body like {}
	
	public void colorShape() {  // these are called concrete methods which as some implementations
		System.out.println("Color defined");
	}
	
	public abstract void sizeShape();
	
	public abstract void eraseShape();
	

	//public static void main(String[] args) {
		// Abstract classes and methods in Java
		/*
		 * Abstraction: process of hiding implementation details with end user
		 * Abstraction can be achieved by using "Abstract Classes" or "Interfaces"
		 * Whatever generic or common information that user is aware upfront, user will define only that 
		 * as Methods, those methods will be called as abstract methods
		 * 
		 * Abstract class and method should have "abstract" keyword
		 * Abstract class can have both Abstract and concrete methods
		 * Abstract class cannot be instantiated
		 * Abstract methods must be overridden by first concrete class which inherits Abstract class 
		 * --- which means implementation of main class
		 * 
		 */

	//}

}
