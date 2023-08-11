package Inheritance;

public class Truck extends vehicleCommon {

	public static void main(String[] args) {
		// Single inheritance -> child has 1 on 1 relationship with parents
		
		Truck tk = new Truck();
		tk.start();
		tk.stop();

	}
	
	public void loadCapacity() {
		System.out.println("Big");
	}

}
