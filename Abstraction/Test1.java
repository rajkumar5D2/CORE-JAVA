class Test1{
	public static void main(String[] args){
	Example1 e = new Xyz();
	e.m1();
	e.m2();
	//e.m3();
	((Sample1)e).m3();
	//((Sample1)e).m3();
	((Xyz)e).m4();
	}
}