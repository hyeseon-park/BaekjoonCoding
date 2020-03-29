package dfsBfs;

import java.util.Scanner;

public class DfsBfs_10451 {
	static int n;
	static int[] arr;
	static boolean[] visited;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int testCase = scan.nextInt();
		for (int i = 0; i < testCase; i++) {
			int count = 0;
			n = scan.nextInt();
			arr = new int[n + 1];
			visited = new boolean[n + 1];
			for (int j = 1; j < n + 1; j++) {
				arr[j] = scan.nextInt();
			}
			scan.close();

			for (int j = 1; j < n + 1; j++) {
				if (!visited[j]) {
					count += dfs(j);
				}
			}
			
			System.out.println(count);
		}
	}

	public static int dfs(int i) {
		if (i == arr[i] || visited[i]) {
			return 1;
		}
		visited[i] = true;
		return dfs(arr[i]);
	}
}