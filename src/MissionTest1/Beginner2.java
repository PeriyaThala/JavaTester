package MissionTest1;

public class Beginner2 {

	public static void main(String[] args) {
		// Single Dimensional Array
		/*
		 * An array is a container object that holds fixed no. of values of same data type
		 * The length is fixed post creation
		 * syntax1: int[] objname = new int[10];
		 * where in above scenario index for objname will start from 0 - 9 i.e., objname[0] = 10; , objname[1] = 20 and so on
		 * Syntax2: int[] objname = {10,20,30,40};
		 * to find the length of the array "objname.length" can be used
		 * syntax3: int objname[] = {10,20,30,40} // this is not recommended to use
		 */
		
		int[] objName = new int[10];
		objName[0] = 10;
		objName[1] = 20;
		objName[2] = 30;
		objName[3] = 40;
		objName[4] = 50;
		System.out.println(objName[2]);
		
		int[] objName2 = {10,20,30,40,50};
		System.out.println(objName2[4]);
		System.out.println(objName.length);
		System.out.println(objName2.length);
		
		// how to use loops to iterate inside single dimensional array
		for(int i = 0; i < objName2.length; i++) {
			System.out.println(objName2[i]);
		}
		
		// An array of array is called multidimensional array
		//replace single [] to multi [][] in the above syntax
		
		int[][] da = {{10,12,23},{0,1,2}};
		for(int i = 0; i<da.length; i++) { // when i = 0, i<2 ///// to have loop inside multidimensional array
			for(int j = 0; j<da[i].length; j++) {
				System.out.println(da[i][j]);
			}
		}
		System.out.println(da.length);

	}

}
