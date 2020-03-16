package dfsBfs;

import java.util.Scanner;

public class DfsBfs_1012 {
	static int[] dx = {1, -1, 0, 0};
	static int[] dy = {0, 0, 1, -1};
	static int m, n, k;
	static int[][] farm;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt(); //테스트 케이스 개수
		for(int i=0; i<t; i++) {			
			m = scan.nextInt(); //가로
			n = scan.nextInt(); //세로
			k = scan.nextInt(); //위치 개수
			farm = new int[n][m];
			scan.nextLine();
			for(int j=0; j<k; j++) {
				int tmpM = scan.nextInt(); //가로
				int tmpN = scan.nextInt(); //세로
				farm[tmpN][tmpM] = 1;
			}
			int count = 0;
			for(int j=0; j<n; j++) { //세로
				for(int l=0; l<m; l++) { //가로
					if(farm[j][l]==1) {
						count++;
						dfs(j, l);
					}
				}
			}
			System.out.println(count);
		}
	}
	static void dfs(int x, int y) {
		farm[x][y] = 0; //0으로 바꾸기
		for(int i=0; i<4; i++) {			
			int nx = dx[i]+x; //세로
			int ny = dy[i]+y; //가로
			if(nx>=0 && nx<n && ny>=0 && ny<m) {				
				if(farm[nx][ny] == 1) {
					dfs(nx, ny);
				}
			}
		}
	}
}