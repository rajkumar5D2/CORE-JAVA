abstract class Car implements Vehicle{
	public void acceleration(){
		System.out.println();
		System.out.println("Press the pedal to accelerate");
		System.out.println("Release the pedal to slow down");
		System.out.println();
	}
	
	public abstract void engine();
	
	public void breaks(){
	System.out.println("Car Breaks Info---");
	System.out.println("Breaks are implemented from "+ this);
	System.out.println("Press the break pedal to apply breaks");
	System.out.println();
	}
	
	public abstract void seatCapacity(); 
	
	public abstract void model();
}