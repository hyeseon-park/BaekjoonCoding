package dfsBfs;

import java.util.Scanner;

public class DfsBfs_1987 {
	static int row, column;
	static int[][] board;
	static boolean[][] visited;
	static boolean[] alphabetArr = new boolean[26];
	static int[] dx = { 1, -1, 0, 0 };
	static int[] dy = { 0, 0, 1, -1 };

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		row = scan.nextInt();
		column = scan.nextInt();
		scan.nextLine();
		board = new int[row][column];
		visited = new boolean[row][column];

		for (int i = 0; i < row; i++) {
			String str = scan.nextLine();
			for (int j = 0; j < column; j++) {
				board[i][j] = str.charAt(j) - 'A';
			}
		}
		scan.close();

		visited[0][0] = true;
		alphabetArr[board[0][0]] = true;
		System.out.println(dfs(0, 0));
	}

	static int dfs(int y, int x) {
		int count = 0;

		for (int i = 0; i < 4; i++) {
			int ny = y + dy[i];
			int nx = x + dx[i];
			if (ny >= 0 && ny < row && nx >= 0 && nx < column && !visited[ny][nx]) {
				if (!alphabetArr[board[ny][nx]]) {
					visited[ny][nx] = true;
					alphabetArr[board[ny][nx]] = true;
					count = Math.max(count, dfs(ny, nx));
					visited[ny][nx] = false;
				}
			}
		}
		alphabetArr[board[y][x]] = false;
		return count + 1;
	}
}
