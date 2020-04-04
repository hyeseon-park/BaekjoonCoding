package dynamicProgramming;

import java.util.Scanner;

public class DynamicProgramming_9465 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int testCase = scan.nextInt();

		for (int i = 0; i < testCase; i++) {
			int n = scan.nextInt();
			int[][] sticker = new int[2][n + 1];
			int[][] dp = new int[2][n + 1];

			for (int j = 0; j < 2; j++) {
				for (int k = 1; k <= n; k++) {
					sticker[j][k] = scan.nextInt();
				}
			}

			dp[0][1] = sticker[0][1];
			dp[1][1] = sticker[1][1];
			for (int j = 2; j <= n; j++) {
				dp[0][j] = Math.max(dp[1][j - 1], dp[1][j - 2]) + sticker[0][j];
				dp[1][j] = Math.max(dp[0][j - 1], dp[0][j - 2]) + sticker[1][j];
			}

			System.out.println(Math.max(dp[0][n], dp[1][n]));
		}
		scan.close();
	}
}
