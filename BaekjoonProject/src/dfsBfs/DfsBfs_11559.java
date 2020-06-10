package dfsBfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DfsBfs_11559 {
	static Character[][] puyo = new Character[12][6];
	static boolean[][] visited;
	static int[] dx = { 0, 0, 1, -1 };
	static int[] dy = { 1, -1, 0, 0 };
	static Queue<Node> q = new LinkedList<Node>();
	static ArrayList<Node> list = new ArrayList<Node>();

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < puyo.length; i++) {
			String line = scan.nextLine();
			for (int j = 0; j < puyo[i].length; j++) {
				puyo[i][j] = line.charAt(j);
			}
		}
		scan.close();

		int series = 0;

		while (true) {
			boolean finish = true;
			down();

			for (int i = 0; i < 12; i++) {
				for (int j = 0; j < 6; j++) {
					if (puyo[i][j] == '.') {
						continue;
					}
					visited = new boolean[12][6];
					visited[i][j] = true;

					int count = 0;
					q.add(new Node(i, j));

					while (!q.isEmpty()) {
						Node current = q.poll();
						count++;
						list.add(current);
						for (int k = 0; k < 4; k++) {
							int nx = current.x + dx[k];
							int ny = current.y + dy[k];

							if (!isRange(nx, ny) || visited[nx][ny] || puyo[nx][ny] != puyo[current.x][current.y]) {
								continue;
							}
							visited[nx][ny] = true;
							q.add(new Node(nx, ny));
						}
					}
					if (count >= 4) {
						for (Node node : list) {
							puyo[node.x][node.y] = '.';
						}
						finish = false;
					}
					list.clear();
				}
			}
			if (finish)
				break;
			series++;
		}
		System.out.println(series);
	}

	static void down() {
		for (int i = 11; i >= 0; i--) {
			for (int j = 0; j < 6; j++) {
				if (puyo[i][j] == '.') {
					continue;
				}

				int nextX = i;
				char color = puyo[i][j];
				puyo[i][j] = '.';
				while (true) {
					if (!isRange(nextX + 1, j) || puyo[nextX + 1][j] != '.') {
						break;
					}
					nextX++;
				}
				puyo[nextX][j] = color;
			}
		}
	}

	static boolean isRange(int x, int y) {
		if (x < 0 || x >= 12 || y < 0 || y >= 6) {
			return false;
		}
		return true;
	}
}

class Node {
	int x;
	int y;

	Node(int x, int y) {
		this.x = x;
		this.y = y;
	}
}