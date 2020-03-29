package dfsBfs;

import java.util.Scanner;

public class DfsBfs_10026 {
	static int n;
	static String[][] grid;
	static boolean[][] visit;
	static int[] dx = { 1, -1, 0, 0 };
	static int[] dy = { 0, 0, 1, -1 };

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int area = 0;
		n = scan.nextInt();
		scan.nextLine();
		visit = new boolean[n][n];
		grid = new String[n][n];
		for (int i = 0; i < n; i++) {
			String str = scan.nextLine();
			for (int j = 0; j < n; j++) {
				grid[i][j] = String.valueOf(str.charAt(j));
			}
		}
		scan.close();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (!visit[i][j]) {
					area++;
					dfs(i, j);
				}
			}
		}
		System.out.println(area);
		
		area = 0;
		visit = new boolean[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (grid[i][j].equals("G")) {
					grid[i][j] = "R";
				}
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (!visit[i][j]) {
					area++;
					dfs(i, j);
				}
			}
		}
		System.out.println(area);
	}

	static void dfs(int x, int y) {
		visit[x][y] = true;
		
		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			if (nx >= 0 && nx < n && ny >= 0 && ny < n) {
				if (grid[nx][ny].equals(grid[x][y]) && visit[nx][ny] == false) {
					dfs(nx, ny);
				}
			}
		}
	}
}
