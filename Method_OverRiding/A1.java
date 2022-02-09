// overLoading and overRiding, Example2 file and Test_Ex file remaining code

class A1{
	void m1(Example2 e){
	System.out.println("example param");
	System.out.println("x: "+e.x);
	}
	
	void m1(Sample2 s){
	System.out.println("sample param");
	System.out.println("x: "+s.x);
	}
}
	
class A2 extends A1{
	void m1(Example2 e){
	int x = 100;
	System.out.println("example subclass param");
	System.out.println("x: "+e.x);
	}
	
	void m1(Sample2 s){
	System.out.println("sample sub param");
	System.out.println("x: "+s.x);
	}
}