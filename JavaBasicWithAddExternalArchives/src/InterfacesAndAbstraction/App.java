package InterfacesAndAbstraction;

public class App {

	public static void main(String[] args) {
		HdfcBank hdfcUser1 = new HdfcBank();
		IciciBank IciciUser1 = new IciciBank();
		
		hdfcUser1.userDetails(); // abstract method define in abstract class
		hdfcUser1.EducationLoanInterestRate(); // abstract method define in RBI INTERFACE 
		hdfcUser1.homeInterestRate(); // abstract method define in RBI INTERFACE 
		hdfcUser1.interestOnFixedDeposit(); // abstract method define in GovBank INTERFACE 
		hdfcUser1.interestOnSavingAccount(); // abstract method define in GovBank INTERFACE 
		hdfcUser1.cashDeposit(); // abstract method define in GovBank >> RBI both INTERFACE 
		hdfcUser1.cashWithdraw(); // abstract method define in GovBank >> RBI both INTERFACE 
		hdfcUser1.creditCard(); // non abstract method define in abstract class
		
		System.out.println("                                   ");
		System.out.println("**********************************");
		System.out.println("                                   ");
		
		IciciUser1.userDetails();
		IciciUser1.EducationLoanInterestRate();
		IciciUser1.homeInterestRate();
		IciciUser1.interestOnFixedDeposit();
		hdfcUser1.interestOnSavingAccount();
		IciciUser1.cashDeposit();
		IciciUser1.cashWithdraw();
		IciciUser1.creditCard();
		
	}

}
