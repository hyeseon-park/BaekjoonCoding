package dfsBfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DfsBfs_3187 {
	static int r, c;
	static char[][] area;
	static boolean[][] visited;
	static int[] dx = { 1, -1, 0, 0 };
	static int[] dy = { 0, 0, 1, -1 };
	static int sheep;
	static int wolf;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		r = scan.nextInt();
		c = scan.nextInt();
		scan.nextLine();
		area = new char[r][c];
		visited = new boolean[r][c];
		for (int i = 0; i < r; i++) {
			area[i] = scan.nextLine().toCharArray();
		}
		scan.close();

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				if (area[i][j] == '#' || visited[i][j]) {
					continue;
				}
				bfs(i, j);
			}
		}

		System.out.println(sheep + " " + wolf);
	}

	static void bfs(int x, int y) {
		Queue<Dot> q = new LinkedList<Dot>();
		int sheepInFence = 0;
		int wolfInFence = 0;

		visited[x][y] = true;
		q.add(new Dot(x, y));

		while (!q.isEmpty()) {
			Dot now = q.poll();
			if (area[now.x][now.y] == 'k')
				sheepInFence++;
			if (area[now.x][now.y] == 'v')
				wolfInFence++;

			for (int i = 0; i < 4; i++) {
				int nx = now.x + dx[i];
				int ny = now.y + dy[i];
				if (!isRange(nx, ny) || visited[nx][ny] || area[nx][ny] == '#') {
					continue;
				}
				visited[nx][ny] = true;
				q.add(new Dot(nx, ny));
			}
		}

		if (wolfInFence >= sheepInFence) {
			wolf += wolfInFence;
		} else {
			sheep += sheepInFence;
		}
	}

	static boolean isRange(int x, int y) {
		if (x < 0 || x >= r || y < 0 || y >= c) {
			return false;
		}
		return true;
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