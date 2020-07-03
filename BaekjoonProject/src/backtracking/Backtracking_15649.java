package backtracking;

import java.util.Scanner;

public class Backtracking_15649 {
	static int n, m;
	static int[] numbers;
	static boolean[] visited;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		n = scan.nextInt();
		m = scan.nextInt();
		scan.close();

		numbers = new int[n + 1];
		visited = new boolean[n + 1];

		backtracking(0);
		System.out.println(sb);
	}

	static void backtracking(int count) {
		if (count == m) {
			for (int i = 0; i < m; i++) {
				sb.append(numbers[i] + " ");
			}
			sb.append("\n");
		}

		for (int i = 1; i <= n; i++) {
			if (!visited[i]) {
				visited[i] = true;
				numbers[count] = i;
				backtracking(count + 1);
				visited[i] = false;
			}
		}
	}
}
