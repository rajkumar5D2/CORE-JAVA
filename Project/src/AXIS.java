
public class AXIS extends BankDetails{
	BankDetails b;
	AXIS(BankDetails ba){
		this.b = ba;
		
	}
	public void deposit(double bal){
		System.out.println("\ncurrent balance is: "+ b.getBal());
			b.setBal(bal+b.getBal());
			System.out.println("\ncurrent balance is: "+ b.getBal());
	}
	
	public double withdraw(double bal) throws InsufficientFundsException {
		System.out.println("\ncurrent balance is: "+ b.getBal());
		if(b.getBal()<=0) {
			throw new InsufficientFundsException("Insufficient funds");
		}
		
		else{
			b.setBal(b.getBal()-bal);
			if(b.getBal()<=0) {
				throw new InsufficientFundsException("Insufficient funds");
			}
			else{System.out.println("\nUpdated balance is: "+ b.getBal());
			return b.getBal();}
		}
	}
	
	public void enquiry() {
		System.out.println("\nname is: "+ b.getName());
		System.out.println("accno is: "+ b.getAccno());
		System.out.println("ifsc is: "+ b.getIfsc());
		System.out.println("Balance is: "+ b.getBal());
		
	}
	
	public void transfer(BankDetails b, double k) throws InsufficientFundsException {

		if(b.getBal()<=0) {
			throw new InsufficientFundsException("Insufficient funds");
		}
		else{
			withdraw(k);
			if(b.getBal()<=0) {
				throw new InsufficientFundsException("Insufficient funds");
			}
			else{System.out.println("\nUpdated balance is: "+ b.getBal());
			}
		}
	}

}
