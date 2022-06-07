package FileHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandlingExample {

	public static void main(String[] args) throws IOException {
		/*
		 * File reader is capable of reading only one character at a time 
		 * it read the characters and return the ascii for the same 
		 * it is slow 
		 * 
		 * */
		// First Create a File Path
		String filePath;
		filePath = "./src/FileHandling/testing.txt";
		
		// Create a object of file reader class
		FileReader obj1 = new FileReader(filePath);
		//System.out.println((char)obj1.read()); return S first char of file
		
		int i;
		while((i = obj1.read())!= -1) 
		{
			System.out.print((char)i);
		}
		obj1.close();
		
		// wite somthing on a file 
		FileWriter obj2 = new FileWriter(filePath);
		obj2.write("mahan hain ");
		obj2.append("hey");
		
		
		obj2.close();
		
		System.out.println(" ");
		System.out.println("finished writing");
		
	}

}
