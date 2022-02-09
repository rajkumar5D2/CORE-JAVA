class Test3{
	public static void main(String[] args){
	
	int q = 20;
	//System.out.println(p);
	System.out.println(q);
	{				// block initialization. inorder to reduce the scope of a variable use block
	  q = 500;			// if we define variable outside block and change its values inside block changed for the rest of 					// the method
	  System.out.println(q);
	  int p = 40;			// scope of p is valid inside block only
	  System.out.println(p);
	  System.out.println();
	}
	int p = 10;			// new outer method variable created with value 10 and valid till end of the current method
	System.out.println(q);
	System.out.println(p);



	// LOCAL VARIABLE TYPE INFERANCE-- a special case for only for local variables to get its type from value(Automatically).
	// a = 10; CE: cannot find symbol (int a = 10; --->TILL JAVA 9V)
	//from java 10V:-
	var a = 10;		// var is a special identifier that can get the type of value stored in local variable
	System.out.println("using var identifier getting data type, a= "+a);	
	}
}
// RULES TO BE FOLLOWED TO CREATE A BLOCK---------
// RULE #1: Local variable created inside a block cannot be accessed outside the block. Its scope is limited to that block only.
// RULE #2: Outside local block we can again define a variable like-(int p  = 40, int p = 10;) in above code.
// RULE #3: If the variable scope is not finished we cannot create again inside local block but can change/assign value.


