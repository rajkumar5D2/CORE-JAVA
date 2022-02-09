abstract class Bike implements Vehicle{
	public void engine(){
	System.out.println("Bike has engine");
	
	}
	
	public abstract void acceleration();
	
	public void breaks(){
	System.out.println("Bike has disc brakes");
	System.out.println("press the lever to break");
	System.out.println("Bike has stopped");
	}
	
	public abstract void seatCapacity();
}
	
	