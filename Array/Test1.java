class Test1{
	public static void main(String[] args){
	double[] d = new double[5];
	A1[] a = new A1[5];
	A1[] b = new B1[4];
	int i = 5;
	long l = i;
	int[] i1 = new int[3];
	long[] l1 = new long[7];
	Object[] o = new A1[2];
	Object[] o1 = new B1[3];
	o1[0] = new C1();
	o1[1] = new A1();
	o1[2] = new B1();
	}
}

class A1{}
class B1 extends A1{}
class C1 extends B1{}