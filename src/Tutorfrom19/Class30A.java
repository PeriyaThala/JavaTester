package Tutorfrom19;

public class Class30A extends Class30{
	
	String empName = "Vanshika";
	int empNo = 143;
	
	/*
	 * public Class30A() { super(); // as super keyword is mentioned atleast once,
	 * the default constructor is called }
	 */
	
	public Class30A() {
		super(24); // to call parameterized constructor we have to call defined argument
	}
	
	public static void main(String[] args) {
		Class30A c = new Class30A();
		c.getData();
		
	}
	public void getData() {
		//super.getData();
		/*
		 * System.out.println(empName); System.out.println(empNo);
		 */
		System.out.println(super.empName); // as super keyword is mentioned atleast once, the default constructor is called
		System.out.println(super.empNo);
	}	

}
