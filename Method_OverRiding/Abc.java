class Abc{
	
	void m1(){
	System.out.println("m1 from ABC");
	}
}

class Bbc extends Abc{
	
	void m1(){
	System.out.println("m1 from BBC");
	}
}

class Cbc extends Bbc{
	
	void m2(){
	System.out.println("m1 from CBC");
	}
}