class MorningStar extends Bus{
	
	static{
		System.out.println("Morning star bus is started");
		System.out.println();
	}

	
	
	public void engine(){
		System.out.println();	
		super.engineInfo();
		System.out.println("Morning star bus has 5.0 litre engine");
		
		System.out.println("Morning star bus has 500hp with MULTI-AXLE");
	System.out.println();
	}
	
	public void breaks(){
		super.breaksInfo();
		super.breaks();
		System.out.println();	
		System.out.println("CAUTION: Morning Star has Air Breaks");
	}
	
	public void seatCapacity(){
		System.out.println();
		super.seatingInfo();		
		System.out.println("Morning star bus has seating capacity of 50");
		System.out.println("In which 20 are sleeper and 30 are seater");
	}
	
}
	