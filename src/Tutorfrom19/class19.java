package Tutorfrom19;

public class class19 {

	public static void main(String[] args) {
		// how to add parameters to a method in Java
		class19 obj = new class19();
		obj.doLogin(); // we can't call "doLogin();" directly as it is not static
		
		//What static keyword does is that particular method belongs to the class instead of object
		/* when we do not specify static then that method belongs to the object of that class so we have to create 
		 * an object first to use them
		 */
		doLogout(); // as we used static keyword
		/*Advantages of having static method:
		 * they are not dependent on object or instance creation
		 * We dont have to create an object for accessing methods that are static
		 */
		System.out.println(obj.addNumbers(10, 20)); // these 10 & 20 are arguments for the parameters x & y
		obj.diffpara("Vasu", 05, 3.17f);
	}
	public void doLogin()
	{
		System.out.println("Logged In");
	}
	public static void doLogout()
	{
		class19 obj1 = new class19();
		obj1.doLogin();
		System.out.println("Logged Out");
	}
	// how to add parameters to a method
	public int addNumbers(int x, int y) //these int x and int y are parameters for addNumbers method
	//whenever I am calling this method I have to ensure that I have to call/pass 2 arguments
	{
		int z = x+y;
		return z; 
		//instead of above one we can also write like return x+y directly instead of creating z variable
	}
	
	// we can also use parameters of different data types
	public void diffpara(String s, int o, float f)
	{
		System.out.println(s + " " + o);
		System.out.println(f);
	}

}
