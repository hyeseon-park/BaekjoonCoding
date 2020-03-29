package dfsBfs;

import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class DfsBfs_2178 {
	static int n;
	static int m;
	static int[][] maze;
	static boolean[][] visited;
	static int[] dx = { 1, -1, 0, 0 };
	static int[] dy = { 0, 0, 1, -1 };

	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);

		n = scan.nextInt();
		m = scan.nextInt();
		scan.nextLine();
		maze = new int[n][m];
		visited = new boolean[n][m];
		for (int i = 0; i < n; i++) {
			String line = scan.nextLine();
			for (int j = 0; j < m; j++) {
				maze[i][j] = Integer.parseInt(line.charAt(j) + "");
				visited[i][j] = false;
			}
		}
		scan.close();

		visited[0][0] = true;
		bfs(0, 0);

		System.out.println(maze[n - 1][m - 1]);
	}

	static void bfs(int x, int y) {
		Queue<Dot> q = new LinkedList<Dot>();
		q.add(new Dot(x, y));
		
		while (!q.isEmpty()) {
			Dot dot = q.poll();
			
			for (int i = 0; i < 4; i++) {
				int nx = dot.x + dx[i];
				int ny = dot.y + dy[i];
				if (nx < 0 || nx >= n || ny < 0 || ny >= m) {
					continue;
				}
				if (visited[nx][ny] || maze[nx][ny] == 0) {
					continue;
				}
				q.add(new Dot(nx, ny));
				maze[nx][ny] = maze[dot.x][dot.y] + 1;
				visited[nx][ny] = true;
			}
		}
	}
}

class Dot {
	int x;
	int y;

	Dot(int x, int y) {
		this.x = x;
		this.y = y;
	}
}