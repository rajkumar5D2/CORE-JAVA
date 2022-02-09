class College{
	public static void main(String[] args){
	Student s1 = new Student();
	Student s2 = new Student();
	Student s3 = new Student();
	System.out.println("before setting student 1 details are--------");
	s1.display();
	System.out.println();
	System.out.println("before setting student 2 details are--------");
	s2.display();
	System.out.println();
	System.out.println("before setting student 3 details are--------");
	s3.display();
	System.out.println();
	
	s1.setSname("raj");
	s2.setSname("kumar");
	s3.setSname("mikkili");
	
	s1.setId(1);
	s2.setId(2);
	s3.setId(3);
	
	s1.setCourse("IT");
	s2.setCourse("CSE");
	s3.setCourse("ECE");
	
	s1.setFee(1000);
	s2.setFee(2000);
	s3.setFee(3000);
	
	System.out.println("after setting student 1 details are--------");
	s1.display();
	System.out.println();
	System.out.println("after setting student 2 details are--------");
	s2.display();
	System.out.println();
	System.out.println("after setting student 3 details are--------");
	s3.display();
	}
}
	
	
	