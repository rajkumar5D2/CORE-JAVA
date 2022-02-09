class Test{
	public static void main(String[] args){
		B b = new B();
		//Q q = b.m1(); 		CE: incompatible types class P cannot be converted to Q
		P p = b.m1();
		System.out.println(p.a);
		/* //System.out.println(p.b);	CE: cannot find symbol variable b
		Q q = (Q)p;
		System.out.println(q.b);
		//System.out.println(p.c);
		R r = (R)p;
		System.out.println(r.c);	// will get op but lines of code will increase*/
		S s = (S)p;
		System.out.println(s.d);
	}
}