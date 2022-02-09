public class MOL2OverloadingMystery{
	public static void main(String[] bdsvf){
		Calleelmpl cl = new Calleelmpl();
			Object ob1 = new Object();
			Object ob2 = "HariKrishna";
			Object ob3 = new Integer(7279);



			cl.foo(ob1);
			cl.foo(ob2);
			cl.foo(ob3);
		System.out.println();
		cl.foo((String)ob2);
		cl.foo((Integer)ob3);
		System.out.println();
		cl.foo((String)ob1);
		//cl.foo((Integer)ob1);
		//cl.foo((String)ob3);
		cl.foo((Integer)ob2);
	}
}