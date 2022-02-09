import java.io.IOException;
class Test01{
	static void name(String n){
	System.out.println(n);
	System.out.println("length is: "+n.length());
	char c = n.charAt(0);
	//System.out.println(c);
	for(int i = 0; i<=n.length();i++){
	     for(int j = 1; j<=n.length();j++){
		if(n.charAt(i)==n.charAt(j)){
		    System.out.println("duplicaten found: "+n.charAt(i));
		    j++;}
			else{j++;}
		}
		i++;
		}
		
	    
	}
}