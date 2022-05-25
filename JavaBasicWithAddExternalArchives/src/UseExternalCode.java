
public class UseExternalCode {
	
	public void New() {
		
		System.out.println("New Function of this project");
	}

	public static void main(String[] args) {
		
		Calculator obj1 = new Calculator();
		obj1.add();
		
		UseExternalCode obj2 = new UseExternalCode();
		obj2.New();

	}

}
