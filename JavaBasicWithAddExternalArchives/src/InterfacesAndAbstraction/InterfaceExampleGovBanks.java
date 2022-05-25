package InterfacesAndAbstraction;

public interface InterfaceExampleGovBanks {

	public void interestOnFixedDeposit() ;
	public abstract void interestOnSavingAccount() ;// we can write abstract only in method name 
	public void cashWithdraw() ; // same name functions are appear in another interface
	public void cashDeposit() ; // same name functions are appear in another interface
}
