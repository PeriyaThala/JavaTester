package Tutorfrom19;

public class Class25 {

	public static void main(String[] args) {
		// Polymorphism in Java
		/*
		 * Polymorphism means many forms
		 * there are 2 types 
		 * Compile type polymorphism -> which is also known as Early Binding, Static Binding, Method overloading
		 * Runtime polymorphism -> Also known as Late binding, Dynamic binding, Method overriding
		 * why it is called compile time or early binding or static binding?
		 * Before executing the code the program knows which method we are executing
		 * 
		 * Method Overloading -> using same Method again with same name in same class but changing parameters/signature 
		 * Basically Method is same but signature is different is called Method Overloading
		 * In Method Overloading -> method name should be same, type of parameter or no of parameter can be different 
		 * 
		 * The parent class provides one functionality and child class must alter that functionality as per the need 
		 * is called Method Overriding
		 * In Method overriding -> both name of the method, type of parameter must be same, inheritance must be there.
		 * Runtime polymorphism is possible only when there is a inheritance
		 * If the general method is not fulfilling the criteria for sub class then we can customize 
		 * general method defined in parent class as per our needs in sub/child class
		 * Only after execution, it determines which method to be called -> run time polymorphism
		 * 
		 * 
		 */
		Class25 cl = new Class25();
		cl.login(8438580309l, "Ponir!u8");

	}
	public void login(String username , String pwd) {
		System.out.println("login successful using username");
	}
	public void login(long phonenumber , String pwd) {
		System.out.println("login successful using phonenumber");
	}
	public void login(long phonenumber , String pwd, int token) {
		System.out.println("login sucessful using token");
	}
	public void makeNoise() {
		System.out.println("Animal makes noise");
	}

}
