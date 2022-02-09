// STATIC CHAPTER VOLUME 1A, PAGENO: 247
class Sample{
	static int c = 40;
	static{
	System.out.println("sample sb1");
	System.out.println(Example.a);
	System.out.println(Example1.z);
	System.out.println("q: "+Example1.q);
	}
	public static void main(String [] args){
	System.out.println("Sample main");
	System.out.println(Example.b);
	System.out.println(Example1.x);
	}
	static int e = 60;
	static{
	System.out.println("sample sb2");
	}
}