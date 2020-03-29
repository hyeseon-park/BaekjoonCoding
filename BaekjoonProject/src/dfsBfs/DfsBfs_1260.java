package dfsBfs;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DfsBfs_1260 {
	static int vertex, edge, startPoint;
	static int[][] graph;
	static boolean[] visit;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		vertex = scan.nextInt();
		edge = scan.nextInt();
		startPoint = scan.nextInt();
		scan.nextLine();
		graph = new int[vertex + 1][vertex + 1];
		visit = new boolean[vertex + 1];
		
		for (int i = 0; i < edge; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			graph[a][b] = graph[b][a] = 1;
		}
		scan.close();
		
		dfs(startPoint);
		System.out.println();
		Arrays.fill(visit, false);
		bfs(startPoint);
	}

	public static void dfs(int vertexPoint) {
		System.out.print(vertexPoint + " ");
		visit[vertexPoint] = true;
		
		for (int j = 1; j < vertex + 1; j++) {
			if (graph[vertexPoint][j] == 1 && visit[j] == false) {
				dfs(j);
			}
		}
	}

	public static void bfs(int vertexPoint) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(vertexPoint);
		visit[vertexPoint] = true;
		
		while (!q.isEmpty()) {
			int vertexVisited = q.poll();
			System.out.print(vertexVisited + " ");
			
			for (int k = 1; k < vertex + 1; k++) {
				if (graph[vertexVisited][k] == 1 && visit[k] == false) {
					q.offer(k);
					visit[k] = true;
				}
			}
		}
	}
}
