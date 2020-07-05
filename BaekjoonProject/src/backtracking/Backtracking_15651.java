package backtracking;

import java.util.Scanner;

public class Backtracking_15651 {
	static int n, m;
	static int[] numbers;
	static StringBuffer sb = new StringBuffer();

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		n = scan.nextInt();
		m = scan.nextInt();
		scan.close();

		numbers = new int[n + 1];

		backtracking(0);
		System.out.println(sb);
	}

	static void backtracking(int count) {
		if (count == m) {
			for (int i = 0; i < m; i++) {
				sb.append(numbers[i] + " ");
			}
			sb.append("\n");
			return;
		}

		for (int i = 1; i <= n; i++) {
			numbers[count] = i;
			backtracking(count + 1);
		}
	}
}
