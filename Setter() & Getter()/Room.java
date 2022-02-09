class Room{
	
	int len;
	int bre;
	
	Room(int len, int bre){		// constructor 
	this.len = len;
	this.bre = bre;
	}
	
	void setLen(int len){
	this.len  = len;
	}
	
	void setBre(int bre){
	this.bre = bre;
	}
	
	void display(){
	System.out.println("room length is: "+len);
	System.out.println("room bredth is: "+bre);
	System.out.println("room area is: "+len*bre);
	}
}