package filereader2;

import java.io.FileInputStream;
//import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class readFile {

	public static void main(String[] args) throws IOException {
		// how to use a file reader class to read the properties file. filereader reads character files
		// FileInputStream reads streaming of raw bytes
		//Step 1: Create an object for FileReader Class
		
		//FileReader fr = new FileReader("D:\\JavaForTesters\\src\\filereader\\textfile.properties");
		//commenting above step to use FileInputStream
		// to use FileInputStream all the steps remains same but object to be created on FileInputStream
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\filereader\\textfile.properties");
		
		/*
		 * in the above step can also be written as 
		 * FileInputStream fis = new FileInputStream("D:\\JavaForTesters\\src\\filereader\\textfile.properties");
		 */
		
		//Step 2: Create an object for properties class
		Properties p = new Properties();
		
		//Step 3: load the properties file
		//p.load(fr);  ///for FileReader
		
		//commenting above step to use fis
		p.load(fis);  ///for FileInputStream
		
		//Step 4: to use get property method to get property
		System.out.println(p.getProperty("She"));
		System.out.println(p.getProperty("He"));
		System.out.println(p.getProperty("Quote"));
		System.out.println(System.getProperty("user.dir"));

	}

}
