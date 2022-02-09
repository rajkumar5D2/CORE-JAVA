// ILLEGAL FORWARD REFERENCE 
class Example2{
	static int a = 10;
	static{
	System.out.println("sb1");
	System.out.println(a);
	// System.out.println(b); 	 CE: ILLEGAL FORWARD REFERENCE cause b is not initialised. System lets us know b is not initi..
	System.out.println(Example2.b);	// use class name to get result if we access before init...to get default value
	}
	public static void main(String[] args){
	System.out.println("in MM");
	System.out.println(a);
	System.out.println(b);
	}
	static int b = 20;
}