import java.util.Scanner;
class EvenOrOdd{
	public static void main(String [] args){
	Scanner s = new Scanner(System.in);
	System.out.print("enter number to check: ");
	int y = s.nextInt();
	NumberTest n = new NumberTest();
	boolean even = n.evenOrOdd(y);
	if(even)
	System.out.println(y+" is even");
	else
	System.out.println(y+" is odd");	
	}
}
	