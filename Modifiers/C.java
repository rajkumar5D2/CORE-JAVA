package p2;
import p1.A;
class C extends A{
	public static void main(String[] args){
	p1.A a = new p1.A();
	C c = new C();
	//System.out.println(a.a);
	//System.out.println(a.b);
	System.out.println(c.c);
	System.out.println(a.d);
	}
}