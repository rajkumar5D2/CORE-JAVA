class College{
	public static void main(String[] args){
		Student[] s = new Student[3];
		System.out.println(s);
		System.out.println(java.util.Arrays.toString(s));
		//Student s1 = new Student();
		//System.out.println(s1);
		s[0] = new Student();
		s[1] = new Student();
		s[2] = new Student();
		System.out.println(java.util.Arrays.toString(s));
		System.out.println(s[0].sno);
		System.out.println(s[0].sname);
		System.out.println(s[0].course);
		System.out.println(s[0].fee);

		s[0].sname = "raj";
		s[0].sno = 101;
		s[0].course = "IT";
		s[0].fee = 1000.0;
	System.out.println(java.util.Arrays.toString(s));
		System.out.println();
		System.out.println(s[0].sno);
		System.out.println(s[0].sname);
		System.out.println(s[0].course);
		System.out.println(s[0].fee);


	}
}