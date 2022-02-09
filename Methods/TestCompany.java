import java.util.Scanner;
class TestCompany{
   public static void main(String [] args){
	Scanner s = new Scanner(System.in);
	System.out.print("enter employee name:");
	String name = s.nextLine();
	System.out.print("enter employee number:");
	int no = s.nextInt();
	s.nextLine();
	System.out.print("enter employee depatrment:");
	String dept = s.nextLine();
	System.out.print("enter employee salary:");
	double sal = s.nextDouble();
	Employee e = new Employee();
	e.ename = name;
	e.eno = no;
	e.edept = dept;
	e.esal  = sal;
	Company c = new Company();
	System.out.println();
	System.out.println();
	System.out.println("ENTERED DETAILS OF EMPLOYEE "+e.ename+" ARE------------");
	c.display(e);
	System.out.println();
	c.annSal(e);
	System.out.println();
	System.out.print("enter percentage value:");
	double per = s.nextDouble();
	c.incSal(e,per);
	}
}
		