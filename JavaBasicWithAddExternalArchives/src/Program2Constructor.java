
public class Program2Constructor {

	int id;
	String name;
	
	// parameter less
	public Program2Constructor() {
		System.out.println("This is parameterless constructor");
	}
	
	//parameterlized 
	public Program2Constructor(int id) {
		this.id = id;
		System.out.println(id);
	}
	
	// multiple parameters 
	public Program2Constructor(int stdID, String stdName) {
		id =stdID;
		name = stdName;
		System.out.println(id);
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		
		Program2Constructor obj1 = new Program2Constructor();
		Program2Constructor obj2 = new Program2Constructor(1);
		Program2Constructor obj3 = new Program2Constructor(2, "shubham");

	}

}
