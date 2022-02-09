class Driver{
	static String name = "Raj";
	void driver(Vehicle v){
	System.out.println("driver "+Driver.name+" started to depot");
	System.out.println("Driver got in Vehicle: "+ v);
	v.acceleration();
	v.engine();
	v.breaks();
	v.seatCapacity();
	System.out.println("\n\ndriving completed-------");
	}
}