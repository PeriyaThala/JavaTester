package Tutorfrom19;

public class Class23 {
	
	private int length;
	private int width;
	private int height;

	public int getLength() {
		return length;
	}

	public void setLength(int l) {
		this.length = l;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int w) {
		this.width = w;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int h) {
		this.height = h;
	}
	
	public void boxDimension(int l,int h,int w) {
		System.out.println("the box dimensions are: " +l+" "+h+" "+w);
	}

	public static void main(String[] args) {
		// Encapsulation in Java
		// Encapsulation means wrapping up of data under single unit
		/* 
		 * achieving encapsulation is a two step process
		 * 1: to define the data in the class as "private"
		 * 2: to achieve the abstraction->having methods exposed outside the class which can be used to set & get data
		 * Encapsulation is mainly for security purpose -> when data do not to be exposed to outer world
		 * Abstraction:  the process of hiding the internal details of an application from the outer world
		 * 
		 */ 
		Class23 oneObj = new Class23();
		oneObj.boxDimension(10, 20, 30);
		
		// by using encapsulation the above main execution method can alone be executed in different class of same 
		// package without changing the length, width and height as they are private. 

	}

}
