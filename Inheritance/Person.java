class Person{
	
   private static int eyes = 2;
   private static int ears = 2;
   private static int hands = 2;
   private static int legs = 2;

  	private String name;
   	private double height;
   	private double weight;
	
	public int getEyes(){
	return eyes;
	}
	
	public int getEars(){
	return ears;
	}
	
	public int getHands(){
	return hands;
	}
	
	public int getLegs(){
	return legs;
	}

	public void setName(String name){
	this.name = name;

	}
	
	public String getName(){
	return name;
	}
	
	public double getHeight(){
	return height;
	}
	
	public double getWeight(){
	return weight;
	}

	void setHeight(double ht){
	this.height = ht;
	}
	
	public void setWeight(double wt){
	this.weight = wt;
	}
	
	
	
	public void eat(Person p ){
	System.out.println(p.getName()+" is eating");
	}
	
	public void sleep(Person p){
	System.out.println(p.getName()+" is sleeping");
	}
}