package Tutorfrom19;

public class Class28 implements Class28A { // when you have to use interface then you need to use "Implements" instead
											// of "extends"

	public static void main(String[] args) {
		// Interfaces
		/*
		 * The only difference between interfaces and abstract class is that we can have
		 * both abstract method and concrete method in abstract classes but in
		 * interfaces we can only have abstract method, - concrete method is not
		 * possible
		 * 
		 */ 
		
		// we can't instantiate in interface like 
		/*
		 * eg:
		 * Class28 cls = new Class28A(); ---> not possible
		 * 
		 */
		
		Class28 cl = new Class28();
		cl.drawShape();
		cl.sizeShape();
		cl.moveShape();

	}

	@Override
	public void drawShape() {
		// TODO Auto-generated method stub
		System.out.println("Circle");

	}

	@Override
	public void sizeShape() {
		// TODO Auto-generated method stub
		System.out.println("XL");

	}

	@Override
	public void moveShape() {
		// TODO Auto-generated method stub
		System.out.println("Right");

	}

}
