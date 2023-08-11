package filereader2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class writeDataToTxtandCSV {

	public static void main(String[] args) throws IOException {
		
//		File f = new File(System.getProperty("user.dir")+"\\src\\filereader\\textfileTXT1.txt"); // for txt file
		File f = new File(System.getProperty("user.dir")+"\\src\\filereader\\textfilecsv4.csv"); // for CSV file
		
		//Step1: Create an object of FileWriter Class
		
		FileWriter fw = new FileWriter(f); // when writing via txt file use .txt extension
		
		/*
		 * we need to use BufferedWriter method that writes text to a character output stream
		 */
		
		//Step2: Create an object of BufferedWriter class
		BufferedWriter br = new BufferedWriter(fw); //we have created the file and setup the connectivity to that file
		
		//Step3: Write Data 
		for(int o = 1; o<10; o++) {
			br.write("Vanshika Vasu Singh"+","); // we have to use comma for csv files
			br.newLine();
			br.write("I love you"+",");
		}
		
		
		//Step4: Close the File
		System.out.println("Written Successfully");
		br.close();
		
		//instead of replacing the txt if we want to append use true keyword as like before in path provider of FileWriter Class
		
		
		
		

	}

}
