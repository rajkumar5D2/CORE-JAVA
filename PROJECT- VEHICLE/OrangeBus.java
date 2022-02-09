class OrangeBus extends Bus{
	static{
		System.out.println("GarudaBus Started");
	System.out.println();
	}

	
	
	public void engine(){
		System.out.println();	
		super.engineInfo();
	System.out.println("Orange bus has 6.0 litre engine");
	System.out.println("It produces 600hp without multi axle");
	System.out.println();
	}
	
	public void breaks(){
		super.breaksInfo();
		super.breaks();
		System.out.println("CAUTION: Orange has 'NO' Breaks");
	}
	
	public void seatCapacity(){
		System.out.println();
		super.seatingInfo();
		System.out.println("Orange bus has seating capacity of 40");
		System.out.println("In which 10 are sleeper and 30 are seater");
	}
	
}