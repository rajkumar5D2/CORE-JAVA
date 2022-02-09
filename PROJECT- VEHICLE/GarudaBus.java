class GarudaBus extends Bus{
	static{
		System.out.println("GarudaBus Started");
		System.out.println();
	}
		
	public void engine(){
	System.out.println();
	super.engineInfo();
	System.out.println("Garuda bus has 4.0 litre engine");
	System.out.println("It produces 400hp without multi axle");
	System.out.println();
	}
	
	public void breaks(){
		super.breaksInfo();
		super.breaks();
		System.out.println("CAUTION: Garuda has disc Breaks");
		System.out.println();
	}
	
	public void seatCapacity(){
		System.out.println();
		super.seatingInfo();
		System.out.println("Garuda bus has seating capacity of 40");
		System.out.println("No sleeper available only seater");
	}
	
}