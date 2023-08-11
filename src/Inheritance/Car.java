package Inheritance;

public class Car extends vehicleCommon{

	public static void main(String[] args) {
		// Hierarchical Inheritance -> Multiple classes inheriting directly from parent class
		
		Car ca = new Car();
		ca.start();
		ca.stop();

	}

}
