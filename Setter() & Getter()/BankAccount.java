class BankAccount{
	
	String bankName;
	long accNum;
	boolean active;
	
	void setBankName(String bankName){
	this.bankName = bankName;
	}

	void setAccNum(long accNum){
	this.accNum = accNum;
	}
	
	void setActive(boolean active){
	this.active = active;
	}
	
	String getBankName(){
	return bankName;
	}

	/*long getAccnum(){
	return accNum;
	}*/

	boolean isActive(){
	
	return active;
	
	}

	void display(){
	
	System.out.println("bank name is: "+getBankName());
	System.out.println("bank account number is: "+accNum);
	//System.out.println(isActive());
	}
}	