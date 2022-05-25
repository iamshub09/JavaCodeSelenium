package EncapsulationDemo;

/*
 * Problem 1: anyone can order to access my variables and they were able to edit and use it the way they want it
 * to resolve this issue i make my variables private and use getter and setter methods : 
 *   
 *   Getter and setter : we can expose only those variables and method which is genuine required to expose bt the use of getter and setter methods, we can not expose other private methods and variables with the use of object  
 *   Getter and setter : this is repeated task for each variable which need to be expose so we use short cut for this : right click > go to source > select getter and setter
 *   Getter and setter : By use of getter and setter user can set invalid values in our variable but, we can check over setter method so that invalid values are not accepted through getter and setter
 * */

public class Student {

	private int id ; // r - no, w-no
	private int rollNo ; // r - yes, w-no
	private String name;// r - yes, w- yes
	private long phoneNumber; // r - yes, w- yes
	private static String schoolName; // r - yes, w- No
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		
		if (name == "Devesh Mathur") {
			System.out.println("Wrong Name");
		}
		else {
			this.name = name;	
		}
		
	}
	
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public int getRollNo() {
		return rollNo;
	}
	
	public static String getSchoolName() {
		return schoolName;
	}

		
	
	
}
