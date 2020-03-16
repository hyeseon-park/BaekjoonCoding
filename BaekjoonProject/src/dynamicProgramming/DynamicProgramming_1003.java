package dynamicProgramming;

import java.util.Scanner;

public class DynamicProgramming_1003 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		int[][] arr = new int[41][2];
		arr[0][0] = 1;
		arr[1][1] = 1;
		for(int i=0; i<t; i++) {
			int n = scan.nextInt();
			for(int j=2; j<=n; j++) {
				arr[j][0] = arr[j-1][0]+arr[j-2][0]; 
				arr[j][1] = arr[j-1][1]+arr[j-2][1]; 
			}
			System.out.println(arr[n][0]+" "+arr[n][1]);
		}
	}
}
