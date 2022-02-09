class Faculty extends Person{
	private String name;
	
	public void setName(String name){
	this.name = name;
	}
	
	public String getName(){
	return name;
	}
	void display(){
	System.out.println("faculty name is: "+ getName());
	}
}