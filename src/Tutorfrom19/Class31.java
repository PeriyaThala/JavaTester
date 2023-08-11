package Tutorfrom19;

public class Class31 {
	//this keyword is a reference variable that refers to the current object 
	int v = 10; // variables defined here are instance variables
	int V = 20; // variables defined here are instance variables
	String s = "Vanshika";
	
	public static void main(String[] args) {
		Class31 cl = new Class31();
		cl.getData();
		
	}
	
	public void getData() {
		int v = 05; //variables defined here are local variables
		int V = 24; //variables defined here are local variables
		System.out.println(v+V); // it will give preference to only local variables
		System.out.println(this.v+this.V);// to access instance variable instead of local variable use "this" keyword
		getData1(); // this.getData1() -- even this is correct, java implicitly calls the methods by appending "this" keyword
	}
	public void getData1() {
		int v = 05; //variables defined here are local variables
		int V = 24; //variables defined here are local variables
		System.out.println(v+V); // it will give preference to only local variables
		System.out.println(this.v+this.V);// to access instance variable instead of local variable use "this" keyword
	}
/////// we can use it for constructors as well
}
