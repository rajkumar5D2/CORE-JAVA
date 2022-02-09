abstract class Bus implements Vehicle{
	
	public void engineInfo(){
		System.out.println("ENGINE INFO---");
	}
	public void seatingInfo(){
		System.out.println("SEATING INFO---");
	}
	public void breaksInfo(){
		System.out.println("BREAKS INFO---");
	}

		
	public void acceleration(){
	System.out.println();
		System.out.println("Press the pedal to accelerate");
		System.out.println("Release the pedal to slow down");
	}
     
	public abstract void engine();
	
	public void breaks(){
	
	System.out.println("Breaks are implemented from "+ this);
	System.out.println("Press the break pedal to apply breaks");
	}
	
	public abstract void seatCapacity(); 
}
	