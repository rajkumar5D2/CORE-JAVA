class Employee{

	String name;
	int id;
	String dept;
	double sal;
	
	void setName(String name){
	this.name = name;
	}


	void setId(int id){
	this.id = id;
	}
	

	void setDept(String dept){
	this.dept =dept;
	}
	

	void setSal(double sal){
	this.sal = sal;
	}
	
	String getName(){
	return name;
	}

	int getId(){
	return id;
	}
	
	String getDept(){
	return dept;
	}
	
	Double getSal(){
	return sal;
	}
	
	void updateSal(double sal){
	double inc = (this.sal*sal)/100;
	this.sal = this.sal+inc;
	System.out.println("updated salary for employee "+name+" is: "+this.sal);
	}

	void display(){
	System.out.println("employee name is: "+name);
	System.out.println("employee id is: "+id);
	System.out.println("employee dept is: "+dept);
	System.out.println("employee sal is: "+sal);
	}
}
	