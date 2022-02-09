import java.util.Scanner;
class MultiD{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.print("enter size of parent array: ");
		int p = s.nextInt();
		System.out.print("enter size of child array: ");
		int c = s.nextInt();
		int[][] ia = new int[p][c];

		for(int i=0; i<ia.length; i++){
			for(int j=0; j<ia[i].length; j++){
				System.out.println(ia[i][j]);
			}
		}
		int count = 3;
		for(int i=0; i<ia.length; i++){
			for(int j=0; j<ia[i].length; j++){
				
				ia[i][j]= count++;
				
			}
		}
		System.out.println();

		for(int i=0; i<ia.length; i++){
			for(int j=0; j<ia[i].length; j++){
				System.out.println(ia[i][j]);
			}
		}
		System.out.println();
		System.out.println(java.util.Arrays.deepToString(ia));
	}
}
		