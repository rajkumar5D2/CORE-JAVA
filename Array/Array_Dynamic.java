import java.util.Scanner;
class Array_Dynamic{
	public static void main(String[] ars){
		
	Scanner s = new Scanner(System.in);
	System.out.print("enter array size:");
	int n = s.nextInt();
	
	int[] i = new int[n];
	for(int j = 0; j<n;j++){
	System.out.print("enter values to store in array i["+j+"]: ");
	i[j] = s.nextInt();
	}
	System.out.println();
	for(int j = 0;j<n; j++){
	System.out.println("entered value in i["+j+"]: "+i[j]);
		}
	}
}
	