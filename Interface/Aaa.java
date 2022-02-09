class Aaa{
	int x = 100 ;
	void m1(Aaa this, Aaa a){
	//System.out.println("Aaa This: "+ this);
	//System.out.println("Aaa a1: "+ a);
	System.out.println("Aaa m1 this.x: "+ this.x);
	System.out.println("Aaa m1 a.x:"+ a.x);
	//this.x = a.x;
	//System.out.println("Aaa m1 this.x "+ this.x);
	}
	//public String toString(){
	//return this.x;
	//}
}

	
class Bbb extends Aaa{
	int x= 20 ;
	void m1(Bbb this, Aaa a){
	//System.out.println("Bbb This: "+ this);	
	//System.out.println("Bbb	 b: "+ b);
	System.out.println("Bbb m1 this.x: "+ this.x);
	System.out.println("Bbb m1 a.x:"+ a.x);
	//this.x = b.x;
	//System.out.println("Bbb m1 this.x "+ this.x);
	}
	
}
	