package Tutorfrom19;

public class Class30 {
	//Super keyword is a reference variable which is used to refer immediate parent class object
	/*
	 * We can access immediate parent class, instance variable or method or the constructor
	 * the constructors are called by default without mentioning particularly when super keyword 
	 * is defined
	 * 
	 */
	public Class30() {
		System.out.println("Parent Constructor");
	}
	
	public Class30(int i) {
		System.out.println("parameterzed constructor");
	}
	
	String empName = "Vasu";
	int empNo = 153;
	
	public void getData() {
		System.out.println(empName);
		System.out.println(empNo);
	}	

}
