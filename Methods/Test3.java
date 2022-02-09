class Test3{
	static void m1(int a){
	System.out.println("before if in m1");
	if(a == 10){
	System.out.println("in if in m1");
	return;
	}
	System.out.println("after if in m1 after if");
	System.out.println("hi in m1");
	}

	static int m2(int a){
	System.out.println("before if in m2");
	if(a == 10){
	System.out.println("in if in m2");
	return a+10;
	}
	System.out.println("after if in m2 after if");
	System.out.println("hi in m2");
	
	return 50;
	}


public static void main(String [] args){
	m1(10);
	m1(20);
	m2(10);
	
	m2(20);
	
}
}