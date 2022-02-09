class College{
	public static void main(String[] args){
	   Student s = new Student();
	   s.name = args[0];
	   s.no = Integer.parseInt(args[1]);
	   s.mobile = Long.parseLong(args[2]);
	   s.course = args[3];
	   s.gender = args[4].charAt(1);
	   s.fee = Double.parseDouble(args[5]);
   	   s.status = Boolean.parseBoolean(args[6]);
	System.out.println("Student instance is created");
	System.out.println("name: "+s.name);
	System.out.println("number: "+s.no);
	System.out.println("mobile number: "+s.mobile);
	System.out.println("course: "+s.course);
	System.out.println("gender: "+s.gender);
	System.out.println("fee: "+s.fee);
	System.out.println("status: "+s.status);
	}
}
