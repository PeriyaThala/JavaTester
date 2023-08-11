package filereader2;

//import java.io.FileWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class writeFile {

	public static void main(String[] args) throws IOException {
		// how to use a file writer class to read the properties file. filewriter writes character files
		// FileOutputStream writes streaming of raw bytes
		//Step 1: Create an object for FileWriter Class
		
		//FileWriter fw = new FileWriter("D:\\JavaForTesters\\src\\filereader\\textfile.properties");
		//commenting above step to use FileOutputStream
		// to use FileOutputStream all the steps remains same but object to be created on FileOutputStream
		
		FileOutputStream fos = new FileOutputStream(System.getProperty("user.dir")+"\\src\\filereader\\textfile.properties", true); /// if we are not mentioning true then it will clear the entire data in that file and adds the newly passed data. To only append the data instead of adding newly we have to specify boolean append as true
		FileOutputStream fos1 = new FileOutputStream(System.getProperty("user.dir")+"\\src\\filereader\\textfilenew.properties", true); /// to create a new file instead of using existing one we can change the name of the file in the link/url provided directly
		
		// fileoutputstream will work in all the cases because reading or writing of images is not possible by using filewriter
		/*
		 * in the above step can also be written as 
		 * FileOutputStream fos = new FileOutputStream("D:\\JavaForTesters\\src\\filereader\\textfile.properties");
		 */
		
		//Step 2: Create an object for properties class
		Properties p = new Properties();
		
		//load is not needed as we are not reasding the data
		
		//Step 3: to use set property method to set property
		
		p.setProperty("Male", "Alpha");// we can keep the key same and change the values for updating any value
		//p.store(fw, "Sample Comments"); // for file writer use this
		p.store(fos1, "Sample Comments");

	}

}
