package dfsBfs;

import java.util.Scanner;

public class DfsBfs_10026 {
	static int[] dx = {1, -1, 0, 0};
	static int[] dy = {0, 0, 1, -1};
	static int n;
	static String[][] grid;
	static boolean[][] visit;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		scan.nextLine();
		grid = new String[n][n];
		visit = new boolean[n][n];
		for(int i=0; i<n; i++) {
			String s = scan.nextLine();
			for(int j=0; j<n; j++) {
				grid[i][j] = String.valueOf(s.charAt(j));
			}
		}
		int area = 0;
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(!visit[i][j]) {
					area++;
					dfs(i, j);
				}
			}
		}
		System.out.println(area);
		for(int i=0; i<grid.length; i++) {
			for(int j=0; j<grid.length; j++) {				
				if(grid[i][j].equals("G")) {
					grid[i][j] = "R";
				}
			}
		}
		visit = new boolean[n][n];
		area = 0;
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(!visit[i][j]) {
					area++;
					dfs(i, j);
				}
			}
		}
		System.out.println(area);
	}
	static void dfs(int x, int y) {
		visit[x][y] = true;
		String color = grid[x][y];
		for(int i=0; i<4; i++) {
			int nx = x + dx[i]; 
			int ny = y + dy[i]; 
			if(nx>=0 && ny>=0 && nx<n && ny<n) {
				if(grid[nx][ny].equals(color) && visit[nx][ny]==false) {
					visit[nx][ny] = true;
					dfs(nx, ny);
				}
			}
		}
	}	
}