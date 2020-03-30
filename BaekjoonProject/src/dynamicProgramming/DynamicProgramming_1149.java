package dynamicProgramming;

import java.util.Scanner;

public class DynamicProgramming_1149 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[][] rgb = new int[n + 1][3];
		rgb[0][0] = rgb[0][1] = rgb[0][2] = 0;
		for (int i = 1; i <= n; i++) {
			rgb[i][0] = scan.nextInt() + Math.min(rgb[i - 1][1], rgb[i - 1][2]);
			rgb[i][1] = scan.nextInt() + Math.min(rgb[i - 1][0], rgb[i - 1][2]);
			rgb[i][2] = scan.nextInt() + Math.min(rgb[i - 1][0], rgb[i - 1][1]);
		}
		scan.close();
		
		System.out.println(Math.min(rgb[n][0], Math.min(rgb[n][1], rgb[n][2])));
	}
}
