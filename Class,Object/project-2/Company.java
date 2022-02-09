class Company{
   public static void main(String [] args){
	Employee e1 = new Employee();
	Employee e2 = new Employee();

		e1.ename = "raj";
		e1.eno = 101;
		e1.sal = 30000;
		e1.dept = "IT";
		e2.ename = "kumar";
		e2.eno = 102;
		e2.dept = "java";
		e2.sal = 270000.0;
		System.out.println("name: "+e1.ename);
		System.out.println("ID: "+e1.eno);
		System.out.println("Dept: "+e1.dept);
		System.out.println("sal: "+e1.sal);
		System.out.println("----------------------");
		System.out.println("name: "+e2.ename);
		System.out.println("ID: "+e2.eno);
		System.out.println("dept: "+e2.dept);
		System.out.println("sal: "+e2.sal);
	}
}