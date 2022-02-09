class BankAccount{
	double balance;
	
	
	void deposit(BankAccount this,double amt){
	
	BankAccount b = new BankAccount();
	
	this.balance = this.balance+amt;
	
	b.balance = b.balance+amt;
	
	System.out.println("updated amount is: "+balance);
	System.out.println("updated amount is: "+b.balance);
	}
}

class Bank{
	
	public static void main(String[] args){
	BankAccount b = new BankAccount();
	b.deposit(500);
	}
}