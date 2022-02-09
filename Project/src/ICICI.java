
public class ICICI extends BankDetails{
	BankDetails b1;
	ICICI(BankDetails ba){
		this.b1 = ba;
		
	}
	public void deposit(double bal){
		System.out.println("\ncurrent balance is: "+ b1.getBal());
			b1.setBal(bal+b1.getBal());
			System.out.println("\ncurrent balance is: "+ b1.getBal());
	}
	
	public double withdraw(double bal) throws InsufficientFundsException {
		System.out.println("\ncurrent balance is: "+ b1.getBal());
		if(b1.getBal()<=0) {
			throw new InsufficientFundsException("Insufficient funds");
		}
		
		else{
			b1.setBal(b1.getBal()-bal);
			if(b1.getBal()<=0) {
				throw new InsufficientFundsException("Insufficient funds");
			}
			else{System.out.println("\nUpdated balance is: "+ b1.getBal());
			return b1.getBal();}
		}
	}
	
	public void enquiry() {
		System.out.println("\nname is: "+ b1.getName());
		System.out.println("accno is: "+ b1.getAccno());
		System.out.println("ifsc is: "+ b1.getIfsc());
		System.out.println("Balance is: "+ b1.getBal());
		
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
