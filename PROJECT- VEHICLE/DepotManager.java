import java.util.Scanner;
class DepotManager{
	public static void main(String[] args) throws ClassNotFoundException,  InstantiationException,  IllegalAccessException{
	Driver d = new Driver();
	//d.driver(new MorningStar());
	Scanner s = new Scanner(System.in);
	System.out.println("Enter vechile which driver- "+ Driver.name +" want to drive");
	System.out.println("select the vehicles available below \nBUSES----\n\t1)Morning Star bus\n\t2)Orange bus\n\t3)Garuda bus\n\nBIKES----\n\t1)Honda\n\t2)Hero\n\nCARS----\n\t1)Benz\n\t2)BMW");
	System.out.println();
	System.out.print("Enter your choice: ");
	String name = s.nextLine();
	//d.driver(name);
	Class cls = Class.forName(name);
	
	Object obj = cls.newInstance();
	Vehicle vehicle = (Vehicle)obj;
	d.driver(vehicle);
	
	}
}		
	