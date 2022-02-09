class Address{
	int streetno;
	String colony;
	
	void setStreet(int stno){
	streetno = stno;
	}
	
	void setColony(String col){
	colony = col;
	}
	
}

class Student{
	int sno;
	String sname;
	Address addr;
	
	void setSname(String name){
	sname= name;
	}
	
	void setSno(int no){
	sno = no;
	}
	
	void setAddress(Address addrs){
	addr= addrs;
	}

	void display(){
	System.out.println("Student name is: "+ sname);
	System.out.println("Student number is: "+ sno);
	System.out.println("Student Address is: "+ addr);
	System.out.println("Student Street no is: "+ addr.streetno);
	System.out.println("Student colony is: "+ addr.colony);
	/*if(addr != null){
	System.out.println("Student Street no is: "+ addr.streetno);
	System.out.println("Student colony is: "+ addr.colony);
	}else{
	System.out.println("enter address for this student");
	}*/
	}
}
	
class College{
	public static void main(String[] args){
	Student s = new Student();
	s.setSname("raj");
	s.setSno(101);
	Address a = new Address();
	a.setStreet(2);
	a.setColony("ssc");
	//s.setAddress(a);
	
	s.display();
	}
}