
public class Calculator {
	
	public void add() {
		System.out.println("jai shree ram");
	
		System.out.println("this is addition");
	}
	
	public void sub() {
		System.out.println("this is sub");
	}

	public void mult() {
		System.out.println("this is multiply");
}

	public void div() {
		System.out.println("this is divide");
}
	public Calculator() {
		System.out.println("this is constructor");
	}

	public static void main(String[] args) {
	
		
		//Basic method to call constructor and functions
		Calculator obj1 = new Calculator();
		obj1.add();
		obj1.mult();
		obj1.sub();
		obj1.div();
		
	
		
//		Calculator obj1; // Constructor is not calling 
//		new Calculator().add(); // With this line of code constructor is calling 


	}

}
