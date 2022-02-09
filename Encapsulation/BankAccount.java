class BankAccount{
	private double balance;
	
	public void setBalance(double balance)throws Exception{
	if(balance<=0)
	throw new Exception("do not pass zero or negative value");
	this.balance = balance;
	}
	
	public double getBalance(){
	return balance;
	}
}