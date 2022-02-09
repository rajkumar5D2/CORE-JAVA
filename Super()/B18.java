class B18 extends A18{
	
	static int a = 50;
	int x = 60;
	
	static void m1(){
		System.out.println("B m1");
	}
	
	void m2(){
		System.out.println("B m2");
	
		System.out.println("B.a= "+a);
		System.out.println("B.a= "+x);
	}
	
	void m4(){
		System.out.println("in m4 a = "+ a);
		System.out.println("in m4 x = "+ x);
		super.a = a-10;
		super.x = x-10;
		System.out.println("after modi super: "+super.a);
		System.out.println("after modi super: "+super.x);
	}
}