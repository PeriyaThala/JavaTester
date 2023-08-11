package MissionTest1;

public class Beginner3 {

	public static void main(String[] args) {
		//Anything that is repetitive task that needs to be externalize or keep it separate entity is called Methods
		//Anything that can be executed and can give o/p with or without input is called method
		//We can call methods as functions in various parts of the code
		//Method is a block of code that only runs when called
		//When we use "public" access specifier -> it can be accessible publicly
		//void -> to return nothing
		
		//doLogin(); -> this is not possible because this method is of non static
		//to access non static methods in static main methods we can create an object and we can call those methods
		Beginner3 objOne = new Beginner3();
		objOne.doLogin(); //we can call the methods multiple times 
		objOne.doLogout();

	}
	
	//How to create methods #18
	public void doLogin() { //if we use public int doLogin() then we can return int like return 12; etc
		//as we are not returning any value, we are using void 
		System.out.println("Login successfull");
	}
	public void doLogout() {
		doLogin(); //as this method is not static we can call it in another non static places
		System.out.println("logout successfull");
	}

}
