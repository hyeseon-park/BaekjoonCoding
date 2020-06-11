package simulation;

import java.util.Scanner;

public class Simulation_14503 {
	static int[][] map;
	static int count;
	static boolean[][] visited;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int r = scan.nextInt();
		int c = scan.nextInt();
		int direction = scan.nextInt();
		map = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				map[i][j] = scan.nextInt();
			}
		}
		scan.close();

		count = 0;
		count++;
		searchLeft(r, c, direction);

		System.out.println(count);
	}

	static void searchLeft(int r, int c, int direction) {
		if (map[r][c] == 0) {
			map[r][c] = -1;
		}

		if (direction == 0) {
			direction = 3;
			if (map[r][c - 1] == 0) {
				count++;
				searchLeft(r, c - 1, direction);
			} else {
				if (isClean(r, c)) {
					if (!isWall(r + 1, c)) {
						searchLeft(r + 1, c, 0);
					} else {
						return;
					}
				} else {
					searchLeft(r, c, direction);
				}
			}
		} else if (direction == 1) {
			direction = 0;
			if (map[r - 1][c] == 0) {
				count++;
				searchLeft(r - 1, c, direction);
			} else {
				if (isClean(r, c)) {
					if (!isWall(r, c - 1)) {
						searchLeft(r, c - 1, 1);
					} else {
						return;
					}
				} else {
					searchLeft(r, c, direction);
				}
			}
		} else if (direction == 2) {
			direction = 1;
			if (map[r][c + 1] == 0) {
				count++;
				searchLeft(r, c + 1, direction);
			} else {
				if (isClean(r, c)) {
					if (!isWall(r - 1, c)) {
						searchLeft(r - 1, c, 2);
					} else {
						return;
					}
				} else {
					searchLeft(r, c, direction);
				}
			}
		} else if (direction == 3) {
			direction = 2;
			if (map[r + 1][c] == 0) {
				count++;
				searchLeft(r + 1, c, direction);
			} else {
				if (isClean(r, c)) {
					if (!isWall(r, c + 1)) {
						searchLeft(r, c + 1, 3);
					} else {
						return;
					}
				} else {
					searchLeft(r, c, direction);
				}
			}
		}
	}

	static boolean isClean(int r, int c) {
		if (map[r][c - 1] != 0 && map[r - 1][c] != 0 && map[r][c + 1] != 0 && map[r + 1][c] != 0) {
			return true;
		}
		return false;
	}

	static boolean isWall(int r, int c) {
		if (map[r][c] == 1) {
			return true;
		}
		return false;
	}
}
