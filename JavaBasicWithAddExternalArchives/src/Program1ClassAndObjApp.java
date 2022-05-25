
public class Program1ClassAndObjApp {

	public static void main(String[] args) {
		// create a object 
				// className refVariable = keyword constructor 
				
		Program1ClassAndObj s1 = new Program1ClassAndObj();
				s1.stdID = 101;
				s1.stdName = "Shubham";
				
				/*
				 * I HAVE DEFINE SCHOOL NAME VARIABLE AS STATIC. 
				 * 
				 * Now, the value of school name define by obj1 is W2A 
				 * and the value will be copy again itself as W2A in obj2 because of use static keyword 
				 * 
				 * Idly if we not use static keyword then for obj2 value should be NULL. 
				 * 
				 * we can call static keyword by this statement also 
				 * System.out.println(ClassAndObjects.schoolName);
				 * 
				 */
				s1.schoolName = "W2A";
				
				
				Program1ClassAndObj s2 = new Program1ClassAndObj();
				s2.stdID = 102;
				s2.stdName = "maa baap ki galti";
				
				System.out.println(s1.stdName);
				System.out.println(s2.stdName);	
				System.out.println(s1.schoolName); //W2A
				System.out.println(s2.schoolName); //W2A because values is copied because variable is static 
				System.out.println(Program1ClassAndObj.schoolName); // call from this way too through className
			    System.out.println("_____________________________________________");
			    
			    Program1ClassAndObj.schoolTimings(); // No need to create a object for this static method 


	}

}
