package InterfacesAndAbstraction;

public class HdfcBank extends AbstractClassExample implements InterfaceExampleRBI, InterfaceExampleGovBanks {

	@Override
	public void interestOnFixedDeposit() { // InterfaceExampleGovBanks >>
		System.out.println("5% interestOnFixedDeposit ");
		
	}

	@Override
	public void interestOnSavingAccount() { // InterfaceExampleGovBanks >>
		System.out.println("5% interestOnSavingAccount ");
		
	}

	@Override
	public void homeInterestRate() { //InterfaceExampleRBI >> 
		System.out.println("10% homeInterestRate ");
		
	}

	@Override
	public void EducationLoanInterestRate() { //InterfaceExampleRBI >>
		System.out.println("10% EducationLoanInterestRate ");
		
	}

	@Override
	public void cashWithdraw() { 	// InterfaceExampleGovBanks >> InterfaceExampleRBI
		System.out.println("20,000 limit for cash withdraw in hdfc bank"); // defination of same name function in both interface is different in this class 
		
	}

	@Override
	public void cashDeposit() { // InterfaceExampleGovBanks >> InterfaceExampleRBI
		System.out.println("1,00,000 limit for cash deposit in hdfc bank");// defination of same name function in both interface is different in this class 
		
	}

	@Override
	public void userDetails() {
		int id=01;
		String userName="shubham mathur";
		String bankName = "HDFC";
		System.out.println(id);
		System.out.println(userName);
		System.out.println(bankName);
		// defination of this function is required as it is created a abstract method in abstract class
	}

	

}
