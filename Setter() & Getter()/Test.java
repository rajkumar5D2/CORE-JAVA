class Test{
	
	int x = 10;
	{
	System.out.println("from nsb: "+x);  
	this.x = 20;
	
	}

	Test(){
	System.out.println("from no param constructor: "+x);
	this.x = 30;
	}
	
	public static void main(String[] args){
	Test t = new Test();
	System.out.println("x: "+t.x);
	}
}