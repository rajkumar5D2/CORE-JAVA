abstract class Example{

	static int x = 10;
	int y = 20;
	
	void m1(){
	System.out.println("from m1 in example: "+ x);
	System.out.println("from m1 in example: "+this);
	System.out.println("from m1 in example: "+this.y);
	System.out.println("from m1 in example: "+ y);
	}
}

class Sample extends Example{
	int y = 30;
	void m1(){
	System.out.println("from m1 in example: "+ x);
	System.out.println("from m1 in example: "+this);
	System.out.println("from m1 in example: "+this.y);
	System.out.println("from m1 in example: "+ super.y);
	}
}