import java.util.Scanner;
class College1{
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		System.out.print("enter how many student you want to enter details: ");
		int n  = scn.nextInt();

		Student1[] s = new Student1[n];

		for(int j = 0; j<n; j++){
			System.out.println("\nenter student "+(j+1)+" details:");
			Student1 s1 = new Student1();

			System.out.print("enter student roll number:");
			s1.sno = scn.nextInt();
			System.out.print("enter student name:");
			s1.sname = scn.next();
			System.out.print("enter student course:");
			s1.course = scn.next();
			System.out.print("enter student fee:");
			s1.fee = scn.nextDouble();
			
			s[j] = s1;
		}
	
		display(s);
	}
	
	static void display(Student1[] s){
		for(int k = 0; k<s.length;k++){
			System.out.print(" \nstudent "+s[k].sname+" details are:");
			System.out.println("\nname is: "+ s[k].sname);
			System.out.println("number is: "+ s[k].sno);
			System.out.println("course is: "+ s[k].course);	
			System.out.println("fee is: "+ s[k].fee);
		}
	}
}	