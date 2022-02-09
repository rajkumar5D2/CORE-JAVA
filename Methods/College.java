import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
class College{
	
	private static String cname;
	private static String cplace;
	private static int cid;
	
	private String sname;
	private int sid;
	private long no;


	static{
		try{
		     BufferedReader s = new BufferedReader(new FileReader("StudentDetails.txt"));
		     String cnam = s.readLine();
		     String cplac = s.readLine();
		     String id = s.readLine();
		     System.out.println("reading data from the file is completed");
		     }
		catch(FileNotFoundException e){
			System.out.println("file not found");
		}
		catch(IOException e){
			System.out.println("connection is closed");
		}
	}
	
	public static void setCName(String cnam){
	   College.cname = cnam;
	}
	public static void setCPlace(String cplac){
	   College.cplace = cplac;
	}
	public static void setCId(int id){
	   College.cid = id;
	}
	
	public static void cName(){
	   System.out.println("College name is: "+cname);	     
	}
	public static void cplace(){
	   System.out.println("College location is: "+cplace);	     
	}
	public static void cid(){
	   System.out.println("College id is: "+cid);	     
	}
	
	public void  display(){
	System.out.println("college name is: "+ cname);
	System.out.println("college location is: "+ cplace);
	System.out.println("college id is: "+ cid);
	System.out.println("student name is: "+ sname);
	System.out.println("student no is: "+ sid);
	System.out.println("college mobile number is: "+ no);
	}
}
	