
interface BankAccount {
	public void deposit(double bal);
	public double withdraw(double bal)throws InsufficientFundsException;
	public void enquiry();
	public void transfer(BankDetails b, double bal) throws InsufficientFundsException;

}
