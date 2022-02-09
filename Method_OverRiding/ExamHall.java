class ExamHall{
	static void conductExam(College1 c){
	Per p = c.getPer();
	System.out.println(p.name);
	
	if(p instanceof Stu){
	Stu s = (Stu)p;
	System.out.println(p.branch);
	}
	
	else if(p instanceof Fac){
	Fac f = (Fac)p;
	System.out.println(f.exp);
		}
	}
}
	