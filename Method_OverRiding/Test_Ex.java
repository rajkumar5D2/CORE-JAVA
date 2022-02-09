class Test_Ex{
	public static void main(String[] args){
	A1 a = new A1();
	A1 a1 = new A2();
	a.m1(new Example2());
	a.m1(new Sample2());
	//a.m1("string");
	//a.m1(null);
	System.out.println();

	Example2 e1 = new Example2();
	Example2 e2 = new Sample2();
	Sample2 s1 = new Sample2();
	//Example2 e3 = null;
	//Sample2 s2 = null;
	
	a.m1(e1);
	a.m1(e2);
	//a.m1(e3);
	a.m1(s1);
	//a.m1(s2);
	System.out.println();
	a1.m1(e1);
	a1.m1(e2);
	a1.m1(s1);
	}
}
	
		