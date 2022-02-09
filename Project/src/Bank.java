import java.util.InputMismatchException;
import java.util.Scanner;
public class Bank {
	public static void main(String[] args) {
		BankDetails b1 = new BankDetails();
		b1.setAccno(1000202020);
		b1.setBal(0);
		b1.setIfsc("HDFC0000ameer");
		b1.setName("Raj");
		HDFC h1 = new HDFC(b1);
	
		BankDetails b2 = new BankDetails();
		b2.setAccno(112121212);
		b2.setBal(0);
		b2.setIfsc("ICICI0000ameer");
		b2.setName("Uday");
		ICICI i = new ICICI(b2);
		
		
		
		BankDetails b3 = new BankDetails();
		b3.setAccno(000000001);
		b3.setBal(0);
		b3.setIfsc("AXIS0000ameer");
		b3.setName("vinay");
		AXIS a = new AXIS(b3);
		
		String option = "";
		
			do {
				System.out.println("\nSelect your bank: \n\t1)HDFC\n\t2)ICICI\n\t3)AXIS");
				Scanner scn = new Scanner(System.in);
				System.out.println("Enter your choice: ");
				option = scn.nextLine();
				
			switch(option) {
		
			case "1":
			{
				System.out.println("YOU HAVE SELECTED RAJ's HDFC ACCOUNT:");
				System.out.println("Select the operation you want to perform: \n\t1)DEPOSIT\n\t2)WITHDRAW\n\t3)ENQUIRY\n\t4)FUNDS TRANSFER");
				System.out.print("Enter your choice: ");
				
				try {
					int x1 = scn.nextInt();
				
					if(x1==1) {
						System.out.print("Enter deposit amount:");
						double y1 = scn.nextDouble();
						h1.deposit(y1);
					}else if(x1==2) {
						System.out.print("Enter withdraw amount:");
						double y1 = scn.nextDouble();
						h1.withdraw(y1);
					}
					else if(x1==3) {
						System.out.println("Displaying Bank details: ");
						h1.enquiry();
					}
					else if(x1==4){
						System.out.println("select destination bank: \n\t1)ICICI\n\t2)AXIS");
						System.out.print("Enter your option: ");
						int z1 = scn.nextInt();
					
						if(z1==1){
						
							System.out.println("Paying to ICICI");
							System.out.print("Enter amount: ");
						
							double k = scn.nextDouble();
							h1.transfer(i,k);
						}
						else if(z1==2) {
						
							System.out.println("Paying to AXIS");
							System.out.print("Enter amount: ");
							double k = scn.nextDouble();
							h1.transfer(a,k);
						} 
					
					}
				} catch (InsufficientFundsException e) {
					System.out.println(e);
				}catch(InputMismatchException e) {
					System.out.println("please enter only numbers");
				}catch(Exception e) {
					e.printStackTrace();
				}
				}break;
			
		
			
			
		case "2":
		{
			System.out.println("YOU HAVE SELECTED KUMAR's ICICI ACCOUNT:");
			System.out.println("Select the operation you want to perform: \n\t1)DEPOSIT\n\t2)WITHDRAW\n\t3)ENQUIRY\n\t4)FUNDS TRANSFER");
			System.out.print("Enter your choice: ");
			try {
			int x2 = scn.nextInt();
			
			if(x2==1) {
				System.out.print("Enter deposit amount:");
				double y2 = scn.nextDouble();
				i.deposit(y2);
			}else if(x2==2) {
				System.out.print("Enter withdraw amount:");
				double y2 = scn.nextDouble();
				i.withdraw(y2);
			}
			else if(x2==3) {
				System.out.println("Displaying Bank details: ");
				i.enquiry();
			}
			else if(x2==4){
				System.out.println("select destination bank: \n\t1)HDFC\n\t2)AXIS");
				System.out.print("Enter your option: ");
				int z = scn.nextInt();
			
				if(z==1){
					System.out.println("Paying to HDFC");
					System.out.print("Enter amount: ");
					double k = scn.nextDouble();
					i.transfer(h1, k);
				//	System.out.println("FUNDS TRANSFER SUCCESSFUL");					
				}
				else if(z==2) {
					System.out.println("Paying to AXIS");
					System.out.print("Enter amount: ");
					double k = scn.nextDouble();
					i.transfer(a, k);
					//System.out.println("FUNDS TRANSFER SUCCESSFUL");	
				}
			}
		} catch (InsufficientFundsException e) {
			System.out.println(e);
		}catch(InputMismatchException e) {
			System.out.println("please enter only numbers");
		}catch(Exception e) {
			e.printStackTrace();
		}
		}break;
		
		
		case "3":
		{
			System.out.println("YOU HAVE SELECTED VINAY's AXIS ACCOUNT:");
			System.out.println("Select the operation you want to perform: \n\t1)DEPOSIT\n\t2)WITHDRAW\n\t3)ENQUIRY\n\t4)FUNDS TRANSFER");
			System.out.print("Enter your choice: ");
			try {
			int x3 = scn.nextInt();
			
			if(x3==1) {
				System.out.print("Enter deposit amount:");
				double y3 = scn.nextDouble();
				a.deposit(y3);
			}else if(x3==2) {
				System.out.print("Enter withdraw amount:");
				double y3 = scn.nextDouble();
				a.withdraw(y3);
			}
			else if(x3==3) {
				System.out.println("Displaying Bank details: ");
				a.enquiry();
			}
			else if(x3==4){
				System.out.println("select destination bank: \n\t1)ICICI\n\t2)HDFC");
				System.out.print("Enter your option: ");
				int z = scn.nextInt();
			
				if(z==1){
					System.out.println("Paying to ICICI");
					System.out.print("Enter amount: ");
					double k = scn.nextDouble();
					a.transfer(i, k);
								
				}
				else if(z==2) {
					System.out.println("Paying to HDFC");
					System.out.print("Enter amount: ");
					double k = scn.nextDouble();
					a.transfer(h1, k);
						
				}
			} break;
		} catch (InsufficientFundsException e) {
			System.out.println(e);
		}catch(InputMismatchException e) {
			System.out.println("please enter only numbers");
		}catch(Exception e) {
			e.printStackTrace();
		}
			}break;default: System.out.println("INVALID OPTION");
	}
				scn.nextLine();
		System.out.print("do you wish to continue, type 'yes' to continue: ");
		 option  = scn.nextLine();
		}while(option.equalsIgnoreCase("yes"));
					
	
		}
	}

