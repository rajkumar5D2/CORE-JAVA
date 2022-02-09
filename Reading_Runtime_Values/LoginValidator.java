import java.io.Console;
class LoginValidator{
	public static void main(String[] args){
	   Console scn = System.console();
	   System.out.print("enter username: ");
	   String username = scn.readLine();
	   System.out.print("enter password: ");
	   char[] password = scn.readPassword();
	   System.out.println("entered details are----");
	   System.out.println("username: "+username);
	   System.out.println("password: "+new String(password));
	}
}