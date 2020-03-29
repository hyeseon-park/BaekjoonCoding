package dfsBfs;

import java.util.Arrays;
import java.util.Scanner;

public class DfsBfs_11403 {
	static int[][] graph;
	static int[][] answer;
	static int[] visited;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int node = scan.nextInt();
		graph = new int[node + 1][node + 1];
		answer = new int[node + 1][node + 1];
		visited = new int[node + 1];
		for (int i = 1; i < node + 1; i++) {
			for (int j = 1; j < node + 1; j++) {
				graph[i][j] = scan.nextInt();
			}
		}
		scan.close();

		for (int i = 1; i < node + 1; i++) {
			dfs(i);
			for (int j = 1; j < node + 1; j++) {
				answer[i][j] = visited[j];
			}
			Arrays.fill(visited, 0);
		}

		for (int from = 1; from < node + 1; from++) {
			for (int to = 1; to < node + 1; to++) {
				System.out.print(answer[from][to] + " ");
			}
			System.out.println();
		}
	}

	static void dfs(int from) {
		for (int to = 1; to <= graph.length - 1; to++) {
			if (graph[from][to] == 1 && visited[to] == 0) {
				visited[to] = 1;
				dfs(to);
			}
		}
	}
}