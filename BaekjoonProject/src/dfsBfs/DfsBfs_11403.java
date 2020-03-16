package dfsBfs;

import java.util.Arrays;
import java.util.Scanner;

public class DfsBfs_11403 {
	static int[][] arr;
	static int[][] ansArr;
	static int[] visited;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		arr = new int[n+1][n+1];
		ansArr = new int[n+1][n+1];
		visited = new int[n+1];
		for(int i=1; i<n+1; i++) {
			for(int j=1; j<n+1; j++) {
				arr[i][j] = scan.nextInt();
			}
		} 
		for(int i=1; i<n+1; i++) {
			dfs(i);
			for(int j=1; j<n+1; j++) {
				ansArr[i][j] = visited[j];
			}
			Arrays.fill(visited, 0);
		}
		for(int from=1; from<n+1; from++) {
			for(int to=1; to<n+1; to++) {
				System.out.print(ansArr[from][to]+" ");
			}
			System.out.println();
		}
	}
	static void dfs(int from) {
		int n = arr.length-1;
		for(int to=1; to<=n; to++) {
			if(arr[from][to]==1 && visited[to]==0) {
				visited[to] = 1;
				dfs(to);
			}
		}
	}
}