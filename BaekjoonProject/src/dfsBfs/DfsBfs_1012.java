package dfsBfs;

import java.util.Scanner;

public class DfsBfs_1012 {
	static int m, n, cabbage;
	static int[][] farm;
	static int[] dx = { 1, -1, 0, 0 };
	static int[] dy = { 0, 0, 1, -1 };

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int testCase = scan.nextInt();
		for (int i = 0; i < testCase; i++) {
			int worm = 0;
			m = scan.nextInt();
			n = scan.nextInt();
			cabbage = scan.nextInt();
			farm = new int[n][m];
			for (int j = 0; j < cabbage; j++) {
				int cabbageM = scan.nextInt();
				int cabbageN = scan.nextInt();
				farm[cabbageN][cabbageM] = 1;
			}

			for (int j = 0; j < n; j++) {
				for (int l = 0; l < m; l++) {
					if (farm[j][l] == 1) {
						worm++;
						dfs(j, l);
					}
				}
			}
			System.out.println(worm);
		}
		scan.close();
	}

	static void dfs(int x, int y) {
		farm[x][y] = 0;

		for (int i = 0; i < 4; i++) {
			int nx = dx[i] + x;
			int ny = dy[i] + y;

			if (nx >= 0 && nx < n && ny >= 0 && ny < m) {
				if (farm[nx][ny] == 1) {
					dfs(nx, ny);
				}
			}
		}
	}
}