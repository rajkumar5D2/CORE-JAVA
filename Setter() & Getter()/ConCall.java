class ConCall{
	
	public static void main(String[] args){
	DefCon c = new DefCon();			// constructor initialize with values 
	DefCon c1 = new DefCon(30,40);			// constructor call with values
	DefCon c2 = new DefCon(c1);			// constructor call with previous obj ref
	c.display();
	c1.display();
	c2.display();
	}
}