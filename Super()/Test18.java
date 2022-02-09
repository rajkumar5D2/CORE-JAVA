class Test18{
	
	public static void main(String[] args){
	
	B18 b1 = new B18();
	B18 b2 = new B18();
	A18 a1 = new B18();
	
	b1.a = 15;
	b1.x = 16;
	System.out.println("after modi "+b1.a);
	System.out.println("after modi "+b1.x);
	b2.a = 18;
	b2.x = 19;
	System.out.println("after modii "+b2.a);
	System.out.println("after modii "+b2.x);
	
	b1.m4();
	b2.m4();
	
	b1.m3();
	System.out.println();
	b2.m3();
	
	System.out.println();
	
	System.out.println(b1.a);
	System.out.println(a1.a);
	
	System.out.println(b1.x);
	System.out.println(a1.x);
	}
}
	
	