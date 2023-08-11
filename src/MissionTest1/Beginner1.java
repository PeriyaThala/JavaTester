package MissionTest1;

public class Beginner1 {
	public int secondVariable; // instance variable

	public int getSecondVariable() {
		return secondVariable;
	}

	public void setSecondVariable(int secondVariable) {
		this.secondVariable = secondVariable;
	}

	public static void main(String[] args) {
		// single line commands
		/*
		 * multiline commands java is case sensitive, Methods starts with lower case
		 */
		// Data Types -> 2
		/*
		 * Primitive datatype -> Defined by programming language -> Byte, short, int,
		 * long, double, float, boolean,char Non primitive datatypes -> these are
		 * reference datatypes -> Strings, Arrays. They go with primitive data types
		 */

		int firstVariable = 10; // local variable
		int thirdVariable = 11;
		Beginner1 myObj1 = new Beginner1();
		myObj1.secondVariable = 10;
		System.out.println(myObj1.secondVariable + firstVariable);
		
		// if, if..else, if..else if..else, nested if
		if (firstVariable > thirdVariable) {
			System.out.println("Big:" + firstVariable);
		} else if (firstVariable == thirdVariable) {
			System.out.println("NoBig");
		} else {
			if(firstVariable == 10) {
				System.out.println(true);
			}
			System.out.println("Big3:" + thirdVariable);
		}
		
		
		// terinary operator
		boolean finalVariable = thirdVariable > firstVariable ? true : false;
		System.out.println(finalVariable);
		
		int intVar = thirdVariable < firstVariable ? 1 : 2;
		System.out.println(intVar);
		
		//Switch statements
		
		switch(firstVariable){
		case 1:
			System.out.println("super");
			break;
		case 10:
			System.out.println("MEga Super");
			break;
		default: 
			System.out.println("no jigili");
			break;
		}
		
		// loops
		//while loop
		while(firstVariable < 15) {
			System.out.println("super" + firstVariable);
			firstVariable ++;
		}
		
		// do while
		do {
			System.out.println("flop"+ myObj1.secondVariable);
			myObj1.secondVariable--;
		}while(myObj1.secondVariable > 9);

		
		//for loop & nested loop
		for(; thirdVariable < 15; thirdVariable++) {
			for(int i = 1; i < thirdVariable; i++) {
				System.out.println(i);
				System.out.println(thirdVariable);
			}
					
		}
		
	}

}
