class Test1{
	static int a = 10;
	int x = 20;
	static void m1(){
	Test1 t = new Test1();	// due to static nature obj cant get in this method so create seperfrate objest within this logic to access x
	System.out.println(a);
	System.out.println(t.x);
	}
	void m2(){
	System.out.println(a);
	System.out.println(x);
	}
	public static void main(String args[]){
	Test1.m1();		// since m1() is static its logic is common to all objects can call by class name or obj name. 
	Test1 t = new Test1();	// for non static variable memory create obj and use the reference.
	t.m1();			// coz of static nature compiler writes t.m1() as Test1.m1() and object could'nt load into a static method. so x(non-static) variable cannot be accessed.
	t.m2();			// coz its a non static variable object can be accessed and x variable value can be accessed
	}
}
	