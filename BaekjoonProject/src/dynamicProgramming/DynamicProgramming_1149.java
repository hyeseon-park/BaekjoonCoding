package dynamicProgramming;

import java.util.Scanner;

public class DynamicProgramming_1149 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[][] ans = new int[n+1][3];
		ans[0][0]=ans[0][1]=ans[0][2]=0;
		for(int i=1; i<=n; i++) {
			ans[i][0] = scan.nextInt()+Math.min(ans[i-1][1], ans[i-1][2]);
			ans[i][1] = scan.nextInt()+Math.min(ans[i-1][0], ans[i-1][2]);
			ans[i][2] = scan.nextInt()+Math.min(ans[i-1][0], ans[i-1][1]);
		}
		System.out.println(Math.min(ans[n][0], Math.min(ans[n][1], ans[n][2])));
	}
}
