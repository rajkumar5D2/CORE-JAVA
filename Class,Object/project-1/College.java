class College{
	public static void main(String []args){
		Student s1 = new Student();
		Student s2 = new Student();
		s1.name = "raj";
		s1.id = 101;
		s1.course = "java";
		s1.fee = 2500.0;
		s2.name = "kumar";
		s2.id = 102;
		s2.course = "java";
		s2.fee = 2700.0;
		System.out.println("name: "+s1.name);
		System.out.println("ID: "+s1.id);
		System.out.println("course: "+s1.course);
		System.out.println("Fee: "+s1.fee);
		System.out.println("----------------------");
		System.out.println("name: "+s2.name);
		System.out.println("ID: "+s2.id);
		System.out.println("course: "+s2.course);
		System.out.println("Fee: "+s2.fee);
	}
}