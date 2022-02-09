class CollegeMain{
	public static void main(String [] args){
	College c = new College();
	College c1 = new College();
	System.out.println("1st object details are: ");
	c.display();
	System.out.println();
	System.out.println("2nd object details are: ");
	c1.display();
	College.cName();
	}
}