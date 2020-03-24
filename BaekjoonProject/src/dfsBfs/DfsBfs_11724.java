package dfsBfs;

import java.util.ArrayList;
import java.util.Scanner;

public class DfsBfs_11724 {
	static ArrayList<ArrayList<Integer>> nodeList = new ArrayList<>();
	static boolean[] visited;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = 0;
		int node = scan.nextInt();
		int edge = scan.nextInt();
		visited = new boolean[node + 1];

		for (int i = 0; i <= node; i++) {
			nodeList.add(new ArrayList<>());
		}
		for (int i = 0; i < edge; i++) {
			int u = scan.nextInt();
			int v = scan.nextInt();
			nodeList.get(u).add(v);
			nodeList.get(v).add(u);
		}
		scan.close();

		for (int i = 1; i < node + 1; i++) {
			if (!visited[i]) {
				dfs(i);
				count++;
			}
		}
		System.out.println(count);
	}

	static void dfs(int nodeNum) {
		visited[nodeNum] = true;
		for (int num : nodeList.get(nodeNum)) {
			if (!visited[num]) {
				dfs(num);
			}
		}
	}
}