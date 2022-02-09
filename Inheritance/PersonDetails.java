import java.util.Scanner;
class PersonDetails{
	public static void main(String[] args){
	
	Student s = new Student();
	Scanner sc = new Scanner(System.in);
	System.out.print("enter name :"); 
	String nam = sc.nextLine();
	System.out.print("enter height: ");
	double ht = sc.nextDouble();
	System.out.print("enter weight: ");
	double wt = sc.nextDouble();
	
	s.setName(nam);
	s.setHeight(ht);
	s.setWeight(wt);
	
	
	System.out.print("enter student roll number: ");
	int no = sc.nextInt();
	// sc.nextInt();
	System.out.print("enter course: ");
	String course = sc.next();
	System.out.print("enter fee: ");
	double fee = sc.nextDouble();
	Person p = s;
	//Canteen c = new Canteen();
	Faculty f = new Faculty();
	f.setName("kumar");
	s.setSno(no);
	s.setCourse(course);
	s.setFee(fee);
	System.out.println();
	System.out.println("Entered student details are---------------");
	s.display();
	f.display();
	//c.eat(s);
	//c.eat(f);
	p.eat(f);
	p.eat(s);
	p.sleep(s);
	p.sleep(f);
	s.read();
	s.write();
	}
}
	
	
	