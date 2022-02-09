
public class BankDetails implements BankAccount{
	private  String name;
	private  long accno;
	private  String ifsc;
	private  double bal;
	
	public long getAccno() {
		return accno;
	}

	public  void setAccno(long accno) {
		this.accno = accno;
	}

	public  String getIfsc() {
		return ifsc;
	}

	public  void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}

	public  double getBal() {
		return bal;
	}

	public  void setBal(double bal) {
		this.bal = bal;
	}

	public  String getName() {
		return name;
	}
	public  void setName(String name) {
		this.name = name;
	}
	public void deposit(double bal) {}
	public double withdraw(double bal)throws InsufficientFundsException {return 0;}
	public void enquiry() {}
	public void transfer(BankDetails b, double bal) throws InsufficientFundsException{}
		
}
