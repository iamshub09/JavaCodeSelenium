
public class Program1ClassAndObj {
	// properties 
			int stdID;
			static String schoolName;
			String stdName;
			
			//Bheviour 
			public void doExercise() {
				System.out.println("please do exercise");
			}
			
			// instance method 
			public void doHomework() {
				
				System.out.println("please do homework");
			}
			
			public void markAtt() {
				System.out.println("please mark attendence");
			}
			
			// we can create this method as static because here we can not use any instance variable 
			public static void schoolTimings() {
				System.out.println("8AM to 2:00PM ");
			}
}