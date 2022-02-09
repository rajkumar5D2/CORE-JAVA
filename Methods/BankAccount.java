class BankAccount{
	
	static String bankName;		// declaring static values, same throught the bank
	static String branchName;
	static String ifsc;
	
	long accNumber;			// declaring non sgtatic values, differ from person to person
	String accHName;
	double balance;
	
	static void bankDetails(String bankN, String branchN, String ifs ){	// getting static values
	bankName = bankN;
	branchName = branchN;
	ifsc = ifs;
	}
	
	void setBankDetails(long accNum, String accNam, double bal){		// getting non static values
	accNumber  	= accNum;
	accHName 	= accNam;
	balance		= bal;
	}

	
	void deposit( double res){					// deposit method
	balance = balance + res;
	System.out.println("balance after deposit: "+balance);
	
	
	} 
	void withdrawl( double res){					// withdrawl method
	balance = balance - res;
	System.out.println("balance after deposit: "+balance);
	} 
	
	void currentBalance(){
	System.out.println("------------Current balance is: "+balance);
	}


	static void bankName(){
	System.out.println("your bane name is: "+ bankName);
	}
	
	static void branchName(){
	System.out.println("your branch name is : "+branchName);
	}
	
	static void ifsc(){
	System.out.println("your IFSC is : "+ifsc);
	}
	
	void readValue(){
	System.out.println("Bank name is: "+bankName);
	System.out.println("Branch name is: "+branchName);
	System.out.println("Bank IFSC is: "+ifsc);
	System.out.println("Bank account number is: "+accNumber);
	System.out.println("Bank holder name is: "+accHName);
	System.out.println("Bank balance is: "+balance);
	}
	
	
	
}
	
	
	