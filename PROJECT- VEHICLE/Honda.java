class Honda extends Bike{
	static{
		System.out.println("Honda bike Started");
		System.out.println("HONDA BIKE DETAILS ARE-----------");
	}
	
	public void engine(){
		super.engine();
		System.out.println("Honda engine no is: "+ this); 
	}
	
	public void acceleration(){
		
		System.out.println("Honda bike is ready to ride");
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
	
	