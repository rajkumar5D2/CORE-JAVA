class B extends A{
static int a = super.x;
	
	static{
	System.out.println(super.x);
	}
	
	static void m1(){
	System.out.println(super.x);
	}
}