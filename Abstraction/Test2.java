// use CMD to get bytecode of this interface to see interface is also a subclass of object class using some attributes.

interface I{
	void m1();
	}
class A2 implements I{
	public  void m1(){System.out.println("in m1 A");}
}
	
class Test2{
	public static void main(String[] args){
	A2 a = new A2();
	a.m1();
	}
}