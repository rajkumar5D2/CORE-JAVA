class Company{
	public static void main(String[] args){
	Employee e1 = new Employee();
	Employee e2 = new Employee();
	e1.setName("raj");
	e1.setId(1);
	e1.setDept("IT");
	e1.setSal(1000);
	
	e2.setName("Kumar");
	e2.setId(2);
	e2.setDept("ITI");
	e2.setSal(2000);
	
	System.out.println("Employee 1 detrails are----------");
	e1.display();
	System.out.println();
	
	System.out.println("Employee 2 detrails are----------");
	e2.display();
	System.out.println();
	
	/*e1.updateSal(20);
	System.out.println();
	
	System.out.println("after updation Employee "+ e1.name+" detrails are----------");
	e1.display();*/
	
	e1.setSal(e1.getSal()+(e1.getSal()*20)/100);
	System.out.println("updated sal: "+e1.getSal());
	}
}