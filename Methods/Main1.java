import java.util.Scanner;
class Main1{
	public static void main(String [] args){
	Scanner s = new Scanner(System.in);
	System.out.print("enter bank name: ");
	String bankName = s.nextLine();
	System.out.print("enter branch name: ");
	String branchName = s.nextLine();
	System.out.print("enter IFSC: ");
	String ifsc = s.nextLine();
	System.out.print("enter Account number: ");
	long accNumber = s.nextLong();	
	s.nextLine();
	System.out.print("enter Account holder name: ");
	String accHName= s.nextLine();
	System.out.print("enter balance: ");
	double bal = s.nextDouble();
	
	BankAccount b = new BankAccount();
	BankAccount b1 = new BankAccount();
	BankAccount.bankName = bankName;
	BankAccount.branchName = branchName;
	BankAccount.ifsc = ifsc;
	b.accNumber = accNumber;
	b.accHName = accHName;
	b.balance = bal;
	b1.accNumber = accNumber;
	b1.accHName = accHName;
	b1.balance = bal;
	//b.bankDetails(bankName, branchName, ifsc);
	//b.setBankDetails(accNumber, accHName, bal);	
	//BankAccount.bankName();
	//BankAccount.branchName();
	//BankAccount.ifsc();
	
	System.out.println("------------ACCOUNT DETAILS OF "+accHName+" are--------");
	b.readValue();
	System.out.println();
	b1.readValue();
	System.out.println("");
	System.out.print("enter deposit amount: ");
	double res = s.nextDouble();
	b.deposit(res);
	System.out.println("");
	b.currentBalance();
	System.out.println("");
	System.out.print("enter withdrawl amount: ");
	double wd = s.nextDouble();
	b.withdrawl(wd);
	System.out.println("");
	b.currentBalance();
	}  
   }
	
	