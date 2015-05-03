package algorithm.sort;
import java.util.Arrays;
public class sort01 {
	
	public static void main (String args[]){
		int a[]	= {1,23,32,21,12,4,6,7,9,0};
		int matrix[][]={{1,1},{2,2}};	;
		int[][] matrix1 = new int[2][2];
		matrix1[0][0]=1;
		matrix1[1][0]=-1;
//		matrix1[2][2]=2;
//		matrix1[3][3]=3;
		for (int i =0;i<matrix1.length;i++){
			for (int j=0;j<matrix1.length;j++){
				System.out.print(matrix1[i][j]+"|");
			}
			System.out.println();
		}
		
		Arrays.sort(a);
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		int i=Arrays.binarySearch(a, 12);
		System.out.print("\n"+i);
	}
}
