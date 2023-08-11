package filereader2;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class readDataToTxtandCSV {

	public static void main(String[] args) throws IOException {
		
//		File f = new File(System.getProperty("user.dir")+"\\src\\filereader\\textfileTXT1.txt"); // for txt file
		File f = new File(System.getProperty("user.dir")+"\\src\\filereader\\textfilecsv4.csv"); // for CSV file
		
		//Step1: Create an object of FileWriter Class
		
		FileReader fr = new FileReader(f);
		
		/*
		 * we need to use BufferedReader method that reads text to a character output stream
		 */ 
		
		//Step2: Create an object of BufferedReader class
		BufferedReader brr = new BufferedReader(fr); //we have created the file and setup the connectivity to that file
		
		//Step3: Read Data 
		System.out.println(brr.readLine());
		System.out.println(brr.readLine());
		
		
		
		//Step4: Close the File
		System.out.println("Read Successfully");
		brr.close();
		
		
		//instead of replacing the txt if we want to append use true keyword as like before in path provider of FileWriter Class
		

	}

}
