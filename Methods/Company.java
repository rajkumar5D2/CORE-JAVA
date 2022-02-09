class Company{

	void display(Employee e){
		System.out.println("name is: "+e.ename);	
		System.out.println("number is: "+e.eno);
		System.out.println("department is: "+e.edept);
		System.out.println("monthly salary is: "+e.esal);
	}
	void annSal(Employee e){
		double ann = e.esal*12;
		System.out.println(e.ename+"'s annual salasry is: "+ann);
	}
	void incSal(Employee e, double per){
		double inc = (e.esal*per)/100;
		double res = inc+e.esal;
		System.out.println("increased by: "+inc);
		System.out.println("increased mothly salary: "+res);
		System.out.println("increased annual salary: "+res*12);
		}
}