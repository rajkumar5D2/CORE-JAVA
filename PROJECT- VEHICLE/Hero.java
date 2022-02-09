class Hero extends Bike{
	static{
		System.out.println("Hero bike Started");
		System.out.println("HERO BIKE DETAILS ARE-----------");
	}
	
	public void engine(){
		super.engine();
		System.out.println("Hero engine no is: "+ this); 
	}
	
	public void acceleration(){
		
		System.out.println("Hero bike is ready to ride");
		System.out.println("Accelerate to move"); 
		System.out.println("Release acceleration to slow down");
	}
	
																													
	public void breaks(){
	super.breaks();
	System.out.println("Release breaks to stop breaking");
	}
	
	public void seatCapacity(){
	System.out.println("Hero bike has 2 seats");
	}
}
	
	