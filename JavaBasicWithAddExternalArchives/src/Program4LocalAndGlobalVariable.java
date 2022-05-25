
public class Program4LocalAndGlobalVariable {
	String a="GLOBAL VARIABLE";
	int i=1; // global
	
	public void show() {
		String a="Local VARIABLE";
		System.out.println(a); // call local variable 
		System.out.println(this.a); // call global variable
	}
	
	public void show2() {
		System.out.println(a); // call global variable
	}
	
	public static void main(String[] args) {
		
		int i=3;// local 
		System.out.println(i); // TO BE DISCUSS
		Program4LocalAndGlobalVariable obj = new Program4LocalAndGlobalVariable();
		obj.show();
		obj.show2();
	}

}
