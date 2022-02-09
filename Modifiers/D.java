package p2;
import p1.A;
class D extends A{
	public static void main(String []args){
	A a = new A();
	D d = new D();
	System.out.println(D.c);
	System.out.println(a.d);
	}
}