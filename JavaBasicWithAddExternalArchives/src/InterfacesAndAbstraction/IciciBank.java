package InterfacesAndAbstraction;

public class IciciBank  extends AbstractClassExample implements InterfaceExampleRBI, InterfaceExampleGovBanks {

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
		System.out.println("50,000 limit for cash withdraw in icici bank");// defination of same name function in both interface is different in this class 
		
	}

	@Override
	public void cashDeposit() { // InterfaceExampleGovBanks >> InterfaceExampleRBI
		System.out.println("2,00,000 limit for cash deposit in icici bank");// defination of same name function in both interface is different in this class 
		
	}

	@Override
	public void userDetails() {
		int id=01;
		String userName="Devesh Bhargava";
		String bankName = "ICICI";
		System.out.println(id);
		System.out.println(userName);
		System.out.println(bankName);
		
	}

}
