
public class Program5ForLoop {

	public static void main(String[] args) {
		
		// Simple use of loop 
		for (int i = 1; i <=5; i++) {
			System.out.println(i);
		}
		
		System.out.println("Condition in Loops:-");
		System.out.println("                     ");
		System.out.println("Condition is : when i values is 2 print naina, when 3 print tommy else print number ");
		
		for (int i = 1; i <=5; i++) {
			if (i==2)
			{
				System.out.println("Happy Birthday Naina");
			}
			else if (i==3)
			{
				System.out.println("Happy Birthday Tommy");
			}
			else {
				System.out.println(i);
			}
		}
		
		
		System.out.println("                     ");
		System.out.println("BREAK Keyword");
		System.out.println("Conditions is : print 1 to 5, when i values is 3. Stop printing and do not print 5 too ");
		
		for (int i = 1; i <=5; i++) {
			
			if(i==5)
			{
				break;
			}
			else {
				System.out.println(i); // always, Apply condition first then print. 
			}
		}
		
		System.out.println("                     ");
		System.out.println("print days of weeks based on number ");
		
		for (int i = 0; i<=7; i++) {
			
			if(i==1) 
			{
				System.out.println("Monday");
			}
			else if (i==2)
			{
			System.out.println("Tuesday");	
			}
			else if (i==3)
			{
			System.out.println("Wednesday");	
			}
			else if (i==4)
			{
			System.out.println("Thusday");	
			}
			else if (i==5)
			{
			System.out.println("Friday");	
			}
			else if (i==6)
			{
			System.out.println("Saturday");	
			}
			else
			{
				System.out.println("Sunday");
			}
			
			
		}
		
		
		
	}

}

