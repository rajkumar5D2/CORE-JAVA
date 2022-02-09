interface I1{
	public abstract void m1();
	
	default void m2(){
	System.out.println("inside m2 default method");	
	m4();
	m5();
	}
	
	public static void m3(){System.out.println("inside m3 public static method");}
	
	private void m4(){
	System.out.println("inside m4 private method cannot call directly cause of private");
	m3();
	}
	
	private static void m5(){
	System.out.println("inside m5 private method cannot call directly cause of private");
	}
	
}
class Test_I1 implements I1{
	public void m1(){
	System.out.println("inside m1 from over ridinng");
	}
	public static void main(String[] args){
	I1 i = new Test_I1();
	i.m1();
	i.m2();
	}
}