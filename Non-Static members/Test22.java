class Test22{
	int x = 10;
	int y = 20;
	
	public static void main(String[] args){
	Test22 t = new Test22();
	Test22 t1;
	System.out.println(t);			// println explicitly calls t.toString method in the current class if not available calls from its super class (java.lang.object class).so t.toString()
	System.out.println(t1);			
	}					// if we override super class method in current class we can change the logic.
	/*public String toString(){
	return "x: "+x+" and y: "+y;		// return is mandatory
	}*/
}
	
						