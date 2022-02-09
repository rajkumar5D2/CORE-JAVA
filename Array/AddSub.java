class AddSub{
	static int[] addSub(int a, int b){
	int add = a+b;
	int sub = a-b;
	return new int[]{add,sub};
	}
	
	public static void main(String[] args){
		int[] res = addSub(5,6);
		System.out.println(res[0]);
		System.out.println(res[1]);
	}
}
