
class Test4{
public static void main(String[] args){
	Example4 e = new Example4();
	e.m1(new Example4());
	e.m1(new Sample4());
	e.m1(new Test4());
	e.m1("abc");
	e.m1(null);
	}
}