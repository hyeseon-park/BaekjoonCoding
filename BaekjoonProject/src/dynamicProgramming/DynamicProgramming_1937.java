package dynamicProgramming;

import java.util.Scanner;

public class DynamicProgramming_1937 {
	static int n;
	static int[][] forest;
	static int[][] dp;
	static int[] dx = { 1, -1, 0, 0 };
	static int[] dy = { 0, 0, 1, -1 };

	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);

		n = scan.nextInt();
		forest = new int[n][n];
		dp = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				forest[i][j] = scan.nextInt();
			}
		}
		scan.close();

		int maxDay = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				maxDay = Math.max(maxDay, goNextBamboo(i, j));
			}
		}
		System.out.println(maxDay);
	}

	static int goNextBamboo(int x, int y) {
		if (dp[x][y] != 0) return dp[x][y];

		int day = 1;
		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if (nx >= 0 && nx < n && ny >= 0 && ny < n) {
				if (forest[nx][ny] > forest[x][y]) {
					day = Math.max(goNextBamboo(nx, ny) + 1, day);
					dp[x][y] = day;
				}
			}
		}
		return day;
	}
}
