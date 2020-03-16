package dfsBfs;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DfsBfs_1260 {
	static int map[][];
	static boolean[] visit;
	static int vertex, edge, startPoint;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		vertex = scan.nextInt(); //정점
		edge = scan.nextInt(); //간선
		startPoint = scan.nextInt(); //번호
		scan.hasNextLine();
		map = new int[vertex+1][vertex+1];
		visit = new boolean[vertex+1];
		for(int j=0; j<vertex+1; j++) {
			Arrays.fill(map[j], 0); //map 배열을 전부 0으로 채움
		}
		Arrays.fill(visit, false); //visit 배열을 전부 false로 채움
		for(int i=0; i<edge; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			map[a][b] = 1;
			map[b][a] = 1;
		}
		dfs(startPoint);
		System.out.println();
		Arrays.fill(visit, false); //visit 배열을 전부 false로 채움
		bfs(startPoint);
	}
	public static void dfs(int startPoint) {
		visit[startPoint] = true;
		System.out.print(startPoint+" ");
		for(int j=1; j<vertex+1; j++) {
			if(map[startPoint][j]==1 && visit[j]==false) {
				dfs(j);
			}
		}
	}
	public static void bfs(int startPoint) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(startPoint);
		visit[startPoint] = true;
		while(!q.isEmpty()) {
			int temp = q.poll();
			System.out.print(temp+" ");
			for(int k=1; k<vertex+1; k++) {
				if(map[temp][k]==1 && visit[k]==false) {
					q.offer(k);
					visit[k] = true;
				}
			}
		}
	}
}
