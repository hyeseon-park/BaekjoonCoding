package backtracking;

import java.util.Scanner;

public class Backtracking_9663 {
	static int n;
	static int count;
	static int[] col;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		n = scan.nextInt();
		scan.close();

		for (int i = 1; i <= n; i++) {
			col = new int[15];
			col[1] = i;
			dfs(1);
		}
		System.out.println(count);
	}

	static void dfs(int row) {
		if (row == n) {
			count++;
		} else {
			for (int i = 1; i <= n; i++) {
				col[row + 1] = i;
				if (isPossible(row + 1)) {
					dfs(row + 1);
				} else {
					col[row + 1] = 0;
				}
			}
		}
		col[row] = 0;
	}

	static boolean isPossible(int c) {
		for (int i = 1; i < c; i++) {
			if (col[i] == col[c]) {
				return false;
			}
			if (Math.abs(col[i] - col[c]) == Math.abs(i - c)) {
				return false;
			}
		}
		return true;
	}
}
