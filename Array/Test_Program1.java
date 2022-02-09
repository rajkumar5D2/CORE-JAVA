class Employee{
	int eno;
	String ename;
	double sal;
	String dept;
	Employee(int eno, String ename, double sal, String dept){
		this.eno = eno;
		this.ename = ename;
		this.sal = sal;
		this.dept = dept;
	}	
	public String toString(){
		return eno+"\t"+ename+"\t"+sal+"\t"+dept;
	}
}

class Test_Program1{
	public static void main(String[] args){
		Employee[] e = {	
					(new Employee(101,"E1",1000,"D1")),
					(new Employee(102,"E2",2000,"D2")),
					(new Employee(103,"E3",3000,"D3"))
					};
		
		
		System.out.println(java.util.Arrays.toString(e));
	}
} 




