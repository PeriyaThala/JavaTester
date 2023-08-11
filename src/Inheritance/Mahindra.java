package Inheritance;

public class Mahindra extends Truck{

	public static void main(String[] args) {
		// Multilevel Inheritance -> one class inheriting the other class which inherits the parent class
		Mahindra mh = new Mahindra();
		mh.start();
		mh.loadCapacity();
		mh.stop();

	}

}
