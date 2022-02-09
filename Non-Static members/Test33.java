class Test33{
	int sno;
	String sname;
	double fee;
	boolean status;
	
	public String toString(){
	return "no: "+sno+"\n"+"sname: "+sname+"\n"+"fee: "+fee+"\n"+"status: "+status;
	}
	public static void main(String[] args){
	Test33 t = new Test33();
	Test33 t1 = null;
	System.out.println(t);
	System.out.println(t1);
	}
}