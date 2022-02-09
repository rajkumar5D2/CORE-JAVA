class Test{
	public static void main(String[] args){
	B1 b = new B1();
	A1 a = b;
	b.m1();
	b.m2();
	System.out.println(b.x);
	System.out.println(b.y);
	System.out.println(a.x);
	//System.out.println(a.y);
	}
}