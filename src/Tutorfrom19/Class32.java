package Tutorfrom19;

public class Class32 {
	// Final keyword is used basically to restrict the user
	// it can be used for variable, method or class itself
	
	public final int i = 10;
	
	public static void main(String[] args) {
		Class32 cl = new Class32();
		System.out.println(cl.i);
		
		/*
		 * cl.i = 20; // we can not assign new values to the variables that are declared
		 * final System.out.println(cl.i);
		 */		 
		
	}

}
/// if you are using final keyword to method, then you can just call this method in other class but you cannot over write it
/// if you are using final keyword to class then you cannot extend or inherit to a parent or child class
/// when you define class as final then it losses the properties of inheritance
