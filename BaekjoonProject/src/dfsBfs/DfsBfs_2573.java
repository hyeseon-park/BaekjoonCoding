package dfsBfs;

import java.util.Scanner;

public class DfsBfs_2573 {
	static int n;
	static int m;
	static int year = 0;
	static int[] dx = { 1, -1, 0, 0 };
	static int[] dy = { 0, 0, 1, -1 };

	static int[][] arr;
	static int[][] shrinkage;
	static boolean[][] visited;

	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);

		n = scan.nextInt();
		m = scan.nextInt();
		arr = new int[n][m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		scan.close();

		visited = new boolean[n][m];

		int icebergCount = checkIcebergCount();
		while (icebergCount < 2) {
			if (icebergCount == 0) {
				year = 0;
				break;
			}
			shrinkage = new int[n][m];
			visited = new boolean[n][m];

			year++;

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					if (arr[i][j] > 0) {
						checkFourDirections(i, j);
					}
				}
			}

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					arr[i][j] -= shrinkage[i][j];
				}
			}

			icebergCount = checkIcebergCount();
		}

		System.out.println(year);
	}

	static void checkFourDirections(int x, int y) {
		int count = 0;
		for (int k = 0; k < 4; k++) {
			int nx = x + dx[k];
			int ny = y + dy[k];
			if (nx >= 0 && nx < n && ny >= 0 && ny < m) {
				if (arr[nx][ny] <= 0) {
					count++;
				}
			}
		}
		shrinkage[x][y] = count;
	}

	static int checkIcebergCount() {
		int icebergCount = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (arr[i][j] > 0 && !visited[i][j]) {
					icebergCount++;
					dfs(i, j);
				}
			}
		}
		return icebergCount;
	}

	static void dfs(int x, int y) {
		visited[x][y] = true;

		for (int k = 0; k < 4; k++) {
			int nx = x + dx[k];
			int ny = y + dy[k];

			if (nx >= 0 && nx < n && ny >= 0 && ny < m) {
				if (arr[nx][ny] > 0 && !visited[nx][ny]) {
					dfs(nx, ny);
				}
			}
		}
	}
}
