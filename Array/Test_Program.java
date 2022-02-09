class Test_Program{
	public static void main(String[] args){
		double[][] d = {{4.0,5.2,6.0,4.7,3.5},{6.2,2.3,4.5,4.7,3.5},{7.0,5.9,2.1,3.1,6.3}};
		for(int i=0; i<d[0].length; i++){
			System.out.print((d[0][i])+"\t");
		}
		
		System.out.println();
		
		for(int i=0; i<d[0].length; i++){
			System.out.print((d[1][i])+"\t");
		}
		
		System.out.println();
		
		for(int i=0; i<d[0].length; i++){
			System.out.print((d[2][i])+"\t");
		}
	}
}