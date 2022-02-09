import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class Addition{
   public static void main(String[] args)throws IOException{
   	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.print("Enter first number: ");
 	int a = Integer.parseInt(br.readLine());
	System.out.print("Enter second number: ");
 	int b = Integer.parseInt(br.readLine());
	System.out.println(a);
	System.out.println(b);
	int c = a+b;
	System.out.println("result="+c);
	}
}
	
 