class Student{
	
	String sname;
	int id;
	String course;
	double fee;
	
	void setSname(String sname){
	this.sname = sname;
	}
	
	void setId(int id){
	this.id = id;
	}

	void setCourse(String course){
	this.course = course;
	}

	void setFee(double fee){
	this.fee = fee;
	}
	
	String getSname(){
	return sname;}


	int getId(){
	return id;}
	
	
	String getCourse(){
	return course;}
	

	double getFee(){
	return fee;}
	
	void display(){
	System.out.println("student name is: "+sname);
	System.out.println("student id is: "+id);
	System.out.println("student course is: "+course);
	System.out.println("student fee is: "+fee);
	}
}