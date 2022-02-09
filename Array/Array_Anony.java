class Array_Anony{
	public static void main(String[] args){
		m1(new int[5]);
		m2(new int[]{1,2,3,4,5});
		System.out.println(java.util.Arrays.toString(m3()));
		System.out.println(java.util.Arrays.toString(m4()));
		}
	static void m1(int[] i){
		System.out.println(java.util.Arrays.toString(i));
	}
	
	static void m2(int[] i){
	System.out.println(java.util.Arrays.toString(i));
	}
	
	static int[] m3(){
	return new int[5];
	}

	static int[] m4(){
	return new int[]{1,2,3,4,5};
	
	}

}