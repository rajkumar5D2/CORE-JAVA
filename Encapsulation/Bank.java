import java.util.Scanner;
public class Bank{
	public static void main(String[] args){
	BankAccount b = new BankAccount();
	Scanner s = new Scanner(System.in);
	while(true){
	try{
	    System.out.print("enter balance: ");
	    double amt = s.nextDouble();
	    b.setBalance(amt);
	    System.out.println("current balance is: "+b.getBalance());
	}catch(Exception e){
	   System.out.println(e.getMessage());
	    }
	  }	// while close
	}	// method close
}		// class close