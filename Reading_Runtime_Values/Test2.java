import java.util.Scanner;
class Test2{
	public static void main(String [] args){
	Scanner scn = new Scanner(System.in);
	System.out.print("enter value:");
	int a = scn.nextInt();
	scn.nextLine();
	System.out.println("number is: "+a);
	System.out.print("enter name:");
	String b = scn.nextLine();
	
	System.out.println("name is: "+b);
	}
}	