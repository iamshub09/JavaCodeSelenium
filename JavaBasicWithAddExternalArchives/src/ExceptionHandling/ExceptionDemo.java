package ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionDemo {

	public static void main(String[] args) {
		
		String filePath;
		filePath = "./src/FileHandling/sting.txt";
		
		try {
			FileReader obj = new FileReader(filePath);
		} catch (FileNotFoundException e) {
			
			//e.printStackTrace();
			System.out.println("File Not Found ! Please try again");
			
		}
		
		
		
		try {
			System.out.println(5/0);
		} catch (Exception e) {
			System.out.println("Airthmetic error");
		}
		
		try {
			System.out.println(10/2);
		} catch (Exception e) {
			System.out.println("airthmetic error 2");
		}
		finally {
			System.out.println("Finally block executed ");
		}
		

	}

}
