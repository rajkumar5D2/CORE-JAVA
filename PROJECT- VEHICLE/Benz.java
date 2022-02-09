class Benz extends Car{
	
	static{
		System.out.println("Benz is started");
		System.out.println();	
		}
	Benz(){
	model();
	}
	public void engine(){
		System.out.println("BENZ ENGINE INFO---");	
		System.out.println("Benz has v8 engine");
		System.out.println("That gives 800hp");
	}
	
	public void seatCapacity(){
		System.out.println();
		System.out.println("Benz seating Info---");	
		System.out.println("Benz has 5 seats");
		System.out.println("Benz is a SUV");
	}
	public  void model(){
		
		System.out.println("MODEL-'E63s 4-DOOR'");
	System.out.println();	
	}
}