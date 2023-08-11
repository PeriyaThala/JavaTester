package Tutorfrom19;

import MissionTest1.Beginner3; //fulfilling second important thing

public class Class20 {

	public static void main(String[] args) {
		// What are packages in JAva
		/*
		 * packages are nothing but grouping of related classes or instances
		 * provides access specifier protection -> restrict access to certain classes -> avoids naming conflicts
		 * two main important things 
		 * 1. To access methods of different class of same package -> we have to create an object for the class of the 
		 * method we are using in the new class
		 * 2. To use method of different class of different package -> you have to import that class
		 */
		//using method of different class in same package -> class19 in class 20 //first important thing
		class19 meth = new class19();
		meth.doLogin();
		
		//second important thing // using method of different class in different package
		Beginner3 metho = new Beginner3();
		metho.doLogout();

	}

}
