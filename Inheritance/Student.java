class Student extends Person{
	
   private static String clgname = "VVIT";
   
  private int sno;
  private String course;
  private double fee;
	
	public String getClgname(){
	return clgname;
	}
	
	public void setSno(int sno){
	this.sno = sno;
	}
	
	public int getSno(){
	return sno;
	}
	
	public void setCourse(String course){
	this.course = course;
	}
	
	public String getCourse(){
	return course;
	}
	
	
	public void setFee(double fee){
	this.fee = fee;
	}
	
	public double getFee(){
	return fee;
	}
	

	public void read(){
	System.out.println(getName()+" is reading "+getCourse());
	}
	
	public void write(){
	System.out.println(getName()+" is writting"+ getCourse());
	}
	
	void display(){
	System.out.println("Entered name is: "+getName());
	System.out.println(getName()+" has "+ getEyes()+" eyes");
	System.out.println(getName()+" has "+getEars()+" ears");
	System.out.println(getName()+" has "+ getHands()+" hands");
	System.out.println(getName()+" has "+ getLegs()+" legs");
	System.out.println(getName()+" height is: "+ getHeight());
	System.out.println(getName()+" wewight is: "+ getWeight());
	System.out.println(getName()+" is studying in: "+ getClgname());
	System.out.println(getName()+" roll number is: "+ getSno());
	System.out.println(getName() +" fee is: "+ getFee());
	}
}