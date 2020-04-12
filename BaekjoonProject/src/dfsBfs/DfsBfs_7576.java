package dfsBfs;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DfsBfs_7576 {
	static int m;
	static int n;
	static int[][] box;
	static int[][] day;

	static int[] dx = { 1, -1, 0, 0 };
	static int[] dy = { 0, 0, 1, -1 };
	static int cm = -1;
	static int cp = -1;
	static int check = -1;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		m = scan.nextInt();
		n = scan.nextInt();
		box = new int[n + 2][m + 2];
		day = new int[n + 2][m + 2];
		
		for (int i = 0; i < n + 2; i++) {
			Arrays.fill(box[i], -1);
			Arrays.fill(day[i], 0);
		}
		for (int i = 1; i < n + 1; i++) {
			for (int j = 1; j < m + 1; j++) {
				box[i][j] = scan.nextInt();
			}
		}
		scan.close();

		bfs();

		int max = -1;
		boolean isEmpty = false;
		for (int i = 1; i < n + 1; i++) {
			for (int j = 1; j < m + 1; j++) {
				if (box[i][j] == 0) {
					isEmpty = true;
				}
				max = Math.max(max, day[i][j]);
			}
		}
		
		if (isEmpty) {
			System.out.println(-1);
		} else {
			if (check == 0) {
				System.out.println(0);
			} else {
				System.out.println(max - 1);
			}
		}
	}

	static void bfs() {
		Queue<Tomato> q = new LinkedList<Tomato>();
		for (int i = 1; i < n + 1; i++) {
			for (int j = 1; j < m + 1; j++) {
				if (box[i][j] == 1) {
					day[i][j] = 1;
					q.offer(new Tomato(i, j));
					cp++;
				}
				if (box[i][j] == -1) {
					cm--;
				}
			}
		}
		if (cp == cm) {
			check = 0;
		}
		while (!q.isEmpty()) {
			Tomato tomato = q.poll();
			box[tomato.x][tomato.y] = 1;

			for (int i = 0; i < 4; i++) {
				if (box[tomato.x + dx[i]][tomato.y + dy[i]] == 0 && day[tomato.x + dx[i]][tomato.y + dy[i]] == 0) {
					q.offer(new Tomato(tomato.x + dx[i], tomato.y + dy[i]));
					day[tomato.x + dx[i]][tomato.y + dy[i]] = day[tomato.x][tomato.y] + 1;
				}
			}
		}
	}
}

class Tomato {
	int x;
	int y;

	Tomato(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
