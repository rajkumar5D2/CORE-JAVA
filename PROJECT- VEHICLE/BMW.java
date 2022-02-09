class BMW extends Car{
	
	static{
		System.out.println("BMW is started");
		}
	BMW(){
	model();
	}
	public void acceleration(){
	super.acceleration();
	System.out.println("CAUTION:- BMW has more power accelerate slowely");
	}
	
	public void engine(){
		System.out.println("BMW has v10 engine");
		System.out.println("That gives 1000hp");
	}
	
	public void seatCapacity(){
		System.out.println("BMW has 4 seats");
		System.out.println("BMW is a SEDAN");
	}
	
	public  void model(){
		
		System.out.println("MODEL-'BMW M5 COMPETITION'");
	}
	
	
}