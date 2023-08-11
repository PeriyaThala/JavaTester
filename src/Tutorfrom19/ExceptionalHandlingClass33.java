package Tutorfrom19;

public class ExceptionalHandlingClass33 {

	public static void main(String[] args) {
		// try catch demo
		try { // we can use try to check if there is a doubt in the script that might throw
				// error
			int i = 10;
			System.out.println("Before handling exception");
			System.out.println(i / 0);// this is a error(exceptional thread), so anything after error will not be
										// printed,
		} catch (Throwable t) { // Throwable is a class that we can use to catch both exceptions and errors
			System.out.println(t.getMessage());
			System.out.println(t.getCause());
			System.out.println(t.getStackTrace());// we can also use t.printStackTrace();
		} finally { //whatever the code return in finally will always gets executed, even the exception occurs or not occurs, it executes
			
			System.out.println("This is finally block");

		}
		System.out.println("After handling exception");

	}
	// what is exceptional handling
	/*
	 * Scenario1: when trying to fetch some file thinking it is present in that
	 * location but it is not actually present in the location basically the file
	 * doesn't exist when trying to read that file this is where exceptional
	 * handling comes to a picture
	 * 
	 * Scenario2: when trying to find the web element on a page but that web element
	 * is not available basically our script unable to find that web element
	 * 
	 * Scenario3: Network issues, os issues, memory issues etc.,,
	 * 
	 * There are lot of methods inside throwable class eg: getCause() -> to find the
	 * cause etc.,
	 * 
	 * Data Cleanup is the best real time example for using finally
	 */

}
