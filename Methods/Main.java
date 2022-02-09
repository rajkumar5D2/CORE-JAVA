import java.util.Scanner;
 class Main{
	public static void main(String[] args){
	Scanner scn = new Scanner(System.in);
	System.out.print("enter value: ");
	int p = scn.nextInt();
	System.out.print("enter percentage: ");
	int q = scn.nextInt();
	int res = 0;
	int res1 = 0;
	Percent.number(p,q,res,res1);
	
	}
	
}
class Percent{
	public static void number(int x,int y,int res,int res1){
		int i = (x*y)/100;
		res = i+x;
		res1 = x-i;
		display(x,y,res,res1);
	}


	static void display(int x,int y,int res,int res1){
		System.out.println("entered original number is: "+ x);
		System.out.println("Increased value is: "+ res);
		System.out.println("decreased value is: "+ res1); 
		System.out.println("Percentage calculated is : "+ y+"%"); 
	}
}