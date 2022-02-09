class Bank{
	public static void main(String[] args){
	BankAccount b1 = new BankAccount();
	b1.setBankName("HDFC");
	b1.setAccNum(1233424312);
	b1.setActive(true);
	b1.display();
	if(b1.isActive()){
	System.out.println("This Account is active");
	}else{
	System.out.println("This Account is inactive");}
	
	}
}