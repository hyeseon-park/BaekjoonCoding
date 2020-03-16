package dfsBfs;

import java.util.PriorityQueue;
import java.util.Scanner;

public class DfsBfs_2667 {
	static int stoi(String s) {
		return Integer.parseInt(s);
	}
	static int n;
	static int[][] arr;
	static int[] dx = {1, -1, 0, 0};
	static int[] dy = {0, 0, 1, -1};
	static int count;
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		arr = new int[n][n];
		scan.nextLine();
		for(int i=0; i<n; i++) {
			String s = scan.nextLine();
			for(int j=0; j<n; j++) {
				arr[i][j] = s.charAt(j) - '0';
			}
		}
		int total = 0; //전체 단지 개수
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(); //오름차순
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(arr[i][j]==1) { //단지가 발견되면 탐색 시작
					count = 0; //각 단지마다 집이 몇 개
					total++;
					dfs(i, j); //dfs를 거치고 나면 count가 집계됨
					pq.add(count);
				}
			}
		}
		System.out.println(total);
		while(!pq.isEmpty()) {
			System.out.println(pq.poll());
		}
	}
	static void dfs(int x, int y) { 
		arr[x][y] = 0;
		count++;
		for(int i=0; i<4; i++) {
			int nx = x+dx[i];
			int ny = y+dy[i];
			if(0<=nx && nx<n && 0<=ny && ny<n) {
				if(arr[nx][ny]==1) {
					dfs(nx, ny);
				}
			}
		}
	}
}