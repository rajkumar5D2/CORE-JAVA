import java.io.IOException;
import java.io.DataInputStream;
class Test{
	public static void main(String[] args)throws IOException{
	DataInputStream dis = new DataInputStream(System.in);
	String s1 = dis.readLine();
	System.out.println(s1);




	 /* String d = "";				// this entire code is available as predefined library file(API)in DataInputStream
	 int b ;
	 while((b=System.in.read())!=13){
		d = d+(char)b;
	}
	System.out.println("Entered data is :"+d);*/



	   /*int a = System.in.read();	// read() method can only read one byte from console
	   System.out.println(a);
	   int b = System.in.read();		// so for the second char write another read method
	   System.out.println("a: "+a);		// read() only display ASCII values of value
	   System.out.println("b: "+b);		// prints ASCII value to the entered value
 	   System.out.println("");
	   char ch = (char)a;			// so convert that value to char to print as it is 
	   char ch1 = (char)b;
	   System.out.println("ch:"+ch);	// results the same value as entered
	   System.out.println("ch1:"+ch1);*/
	   /*System.out.println("");
	   String s2 = ""+ch+ch1;		// making individual char to string
	   System.out.println("s2:"+s2);
	   System.out.println("a: "+(char)a);
   	   System.out.println("b: "+(char)b);
	   System.out.println("");
	   String s1 = ""+(char)a+(char)b;
   	   System.out.println("String type s1: "+s1);
	   int c = Integer.parseInt(s1);	// converting string to integer type
	   System.out.println("");
	   System.out.println("integer type c: "+c);*/

	  /* char ch = (char)a;
	   char ch1 = (char)b;
	   String s3 = ""+ch+ch1;
 	   int c = Integer.parseInt(s3);
	   System.out.println("integer type c: "+c);	*/
	   
	}
}