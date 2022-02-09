class Test_Aaa{
	public static void main(String[] args){
	Aaa a1 = new Aaa();
	Aaa a = new Bbb();
	Bbb b = new Bbb();
	a1.m1(a1);
	System.out.println();
	a.m1(a1);
	System.out.println();
	b.m1(b);
	//System.out.println("Aaa a1: "+ a1);
	//System.out.println("Aaa a: "+ a);
	//System.out.println("Bbb b: "+ b);
	}
}
