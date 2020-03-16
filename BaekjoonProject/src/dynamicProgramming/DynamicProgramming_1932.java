package dynamicProgramming;

import java.util.Scanner;

public class DynamicProgramming_1932 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[][] arr = new int[n+1][n+1];
		arr[1][1] = scan.nextInt();
		for(int i=2; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				arr[i][j] = scan.nextInt()+Math.max(arr[i-1][j-1], arr[i-1][j]);
			}
		}
		int max = 0;
		for(int i=1; i<=n; i++) {
			if(max<arr[n][i]) {
				max = arr[n][i];
			}
		}
		System.out.println(max);
	}
}