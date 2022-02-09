class Area{
	public static void main(String[] args){
	
	Room r = new Room(10, 20);
	r.display();
	System.out.println("After updation------------");
	r.setLen(20);
	r.setBre(30);
	r.display();
	}
}