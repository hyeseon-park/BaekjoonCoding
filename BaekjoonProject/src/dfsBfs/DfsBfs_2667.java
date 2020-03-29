package dfsBfs;

import java.util.PriorityQueue;
import java.util.Scanner;

public class DfsBfs_2667 {
	static int n;
	static int[][] map;
	static int house;
	static int complex;
	static int[] dx = { 1, -1, 0, 0 };
	static int[] dy = { 0, 0, 1, -1 };

	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		map = new int[n][n];
		scan.nextLine();
		for (int i = 0; i < n; i++) {
			String str = scan.nextLine();
			for (int j = 0; j < n; j++) {
				map[i][j] = str.charAt(j) - '0';
			}
		}
		scan.close();
		
		PriorityQueue<Integer> houseQueue = new PriorityQueue<Integer>();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (map[i][j] == 1) {
					house = 0;
					complex++;
					dfs(i, j);
					houseQueue.add(house);
				}
			}
		}
		
		System.out.println(complex);
		while (!houseQueue.isEmpty()) {
			System.out.println(houseQueue.poll());
		}
	}

	static void dfs(int x, int y) {
		map[x][y] = 0;
		house++;
		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			if (0 <= nx && nx < n && 0 <= ny && ny < n) {
				if (map[nx][ny] == 1) {
					dfs(nx, ny);
				}
			}
		}
	}
}