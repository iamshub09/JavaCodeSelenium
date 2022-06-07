package FileHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderExample {

	public static void main(String[] args) throws IOException {
		/*
		 * File reader is capable of reading complete line 
		 * it is fast
		 * 
		 * */
		String filePath;
		filePath = "./src/FileHandling/testing.txt";
		FileReader obj1 = new FileReader(filePath);
		BufferedReader obj2 = new BufferedReader(obj1);
		// System.out.println(obj2.readLine()); // reads only one line 
		String i;
		while((i = obj2.readLine())!= null) 
		{
			System.out.println(i);
		}
		obj1.close();
		
	}

}