abstract class Example1{

	static int x = 10;
	int y = 20;
	
	abstract void m1();
	abstract void m2();
}

abstract class Sample1 extends Example1{
	
	void m1(){
	System.out.println("from m1 in sample: "+ this);
	}
	abstract void m3();
}

class Xyz extends Sample1{
	void m2(){
	System.out.println("from m2 in xyz: "+ this);
	}
	void m3(){
	System.out.println("from m3 in xyz: "+ this);
	}
	void m4(){
	System.out.println("from m4 in xyz: "+ this);
	}
}