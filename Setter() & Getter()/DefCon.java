class DefCon{
	int x;
	int y;
	
	DefCon(){		// Its a constructor created by user to initialize values at the time of obj creation. Constructor name and class name must be same and parameters must match.
	x = 10;
	y = 20;
	}
	
	DefCon(int x, int y){
	this.x = x;
	this.y = y;
	}
	
	DefCon( DefCon c){
	this.x = c.x;
	this.y = c.y;
	}

	void display(){
	System.out.println("x is: "+x);
	System.out.println("y is: "+y);
	}
}