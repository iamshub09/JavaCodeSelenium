package StringDemo;

public class App {

	public static void main(String[] args) {
		
		String name = "shubham"; // string literal declaraction 
		System.out.println(name);
		name.concat("Mathur");
		System.out.println(name);
		
		/*
		 * Output : 
		 * shubham
		 * shubham
		 * 
		 * */
		
		// need to re-assing the value for update in the memory 
		name= name.concat("Mathur");
		System.out.println(name);
		
		/*
		 * Output : 
		 * shubham
		 * shubham
		 * shubhamMathur
		 * 
		 * */
		
		// string keyword declaraction 
		String name2 = new String("Hello");
		name2= name2.concat("World");
		System.out.println(name2);
		/*
		 * shubham
		 * shubham
		 * shubhamMathur
		 * HelloWorld
		 * 
		 * */
		
	
	// 	String buffer and methods 
		StringBuffer bf = new StringBuffer("BOB");
		StringBuffer bf2 = new StringBuffer("BOB mam");
		bf.append(" the builder");
		System.out.println(bf);
		System.out.println(bf.deleteCharAt(4));
		System.out.println(bf.codePointAt(4));
		System.out.println(bf2.equals(bf));
		System.out.println(bf.length());
		System.out.println(bf.delete(1, 3));
		
	}

}
