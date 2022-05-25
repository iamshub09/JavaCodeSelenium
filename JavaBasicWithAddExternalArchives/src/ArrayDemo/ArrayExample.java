package ArrayDemo;

public class ArrayExample {

	public static void main(String[] args) {
		
		// array declare
		int id[];  
		int[] rollNo; 
		
		// array instantiation 
		id = new int[5];
		rollNo = new int[5];
		
		// array initilation 
		id[0]=2;
		id[1]=4;
		id[2]=6;
		id[3]=8;
		id[4]=10;
		System.out.println("lENGTH OF ARRAY IS : "+ id.length);
		System.out.println("Value of index 0 : "+id[0]);
		System.out.println("Value of index 1 : "+id[1]);
		System.out.println("Value of index 2 : "+id[2]);
		System.out.println("Value of index 3 : "+id[3]);
		System.out.println("Value of index 4 : "+id[4]);
		
		System.out.println("print element using for each loop");
		for(int a : id ) 
		{
			System.out.println(a);
		}
		
		// array declare + instantiation + initilation
				String subject[] = new String[5];
				int[] teachers = new int[5];
				
				System.out.println("                    ");
				
				subject[0] = "maths";
				subject[1] = "science";
				System.out.println("lENGTH OF ARRAY IS : "+ subject.length);
				System.out.println("Value of index 0 : "+subject[0]);
				System.out.println("Value of index 1 : "+subject[1]);
				
				System.out.println("                    ");
						
		for (int i = 0; i < subject.length; i++) {
			System.out.println(subject[i]);
			
		}
		
		
	}
}
