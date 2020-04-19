package graph;

import java.util.Scanner;

public class Graph_5567 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int count = 0;
		int friend = scan.nextInt();
		int length = scan.nextInt();
		boolean[][] matrix = new boolean[friend + 1][friend + 1];
		boolean[] invite = new boolean[friend + 1];

		for (int i = 0; i < length; i++) {
			int f1 = scan.nextInt();
			int f2 = scan.nextInt();
			matrix[f1][f2] = matrix[f2][f1] = true;
		}
		scan.close();

		for (int i = 2; i <= friend; i++) {
			if (matrix[1][i]) {
				if (!invite[i]) {
					count++;
					invite[i] = true;
				}
				for (int j = 2; j <= friend; j++) {
					if (matrix[i][j] && !invite[j]) {
						count++;
						invite[j] = true;
					}
				}
			}
		}
		System.out.println(count);
	}
}