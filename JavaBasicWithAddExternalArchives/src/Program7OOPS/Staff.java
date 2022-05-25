package Program7OOPS;

public class Staff extends ParentClassSchool{

	public void doMaintainace() {
		System.out.println("please staff complete your maintainance");
	}
	
	
	// Polymorphsym  
	@Override
	public void doExercise() {
		System.out.println("Staff can be do exerices for 30 mins only ");
	}
	
}
