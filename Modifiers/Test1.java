class Test1{
   static int a = 50;
   int x = 20;
	void m1(){
	
	
	System.out.println(x+" inside void");
	}
public static void main(String [] args){
	// System.out.println(5);
	int a = 5;
	System.out.println(a);
	Test1 t = new Test1();
	Test1 t1 = new Test1();
	System.out.println(t.a);
	System.out.println(t1.a);
	System.out.println(t.x);
	t.a = 21;
	System.out.println(t.a);
	System.out.println(t1.a);
	System.out.println(a);
	t.x = 500;
	t.m1();
	t1.m1();
    }
}