package bruteForce;

import java.util.Scanner;

public class BruteForce_14502 { //연구소
	static int[] dx = {1, -1, 0, 0};
	static int[] dy = {0, 0, 1, -1};
	static int[][] map, tmpMap;
	static int n, m;
	static int wallCount;
	static int safetyArea;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt(); //세로
		m = scan.nextInt(); //가로
		map = new int[n][m];
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				map[i][j] = scan.nextInt(); //0빈칸, 1벽, 2바이러스
			}
		}
		for(int i=0; i<n*m; i++) {
			int nx = (int)i/m;
			int ny = i%m;
			if(map[nx][ny] == 0) {
				map[nx][ny] = 1;
				buildWall(i, 1);
				map[nx][ny] = 0;
			}
		}
		System.out.println(safetyArea);
	}
	
	static void buildWall(int v, int cnt) {
		if(cnt == 3) {
			tmpMap = new int[n][m];
			for(int i=0; i<n; i++) {
				for(int j=0; j<m; j++) {
					tmpMap[i][j] = map[i][j];
				}
			}
			for(int i=0; i<n; i++) {
				for(int j=0; j<m; j++) {
					if(tmpMap[i][j]==2) {
						spreadVirus(i, j);
					}
				}
			}
			countSafetyArea();
		} else {
			for(int i=v+1; i<n*m; i++) {
				int nx = (int)i/m;
				int ny = i%m;
				if(map[nx][ny] == 0) {
					map[nx][ny] = 1;
					buildWall(i, cnt+1);
					map[nx][ny] = 0;
				}
			}
		}
	}
	
	static void spreadVirus(int x, int y) {
		for(int i=0; i<4; i++) {
			int nx = x+dx[i];
			int ny = y+dy[i];
			if(nx>=0 && ny>=0 && nx<n && ny<m) {
				if(tmpMap[nx][ny] == 0) {
					tmpMap[nx][ny] = 3; //바이러스 
					spreadVirus(nx, ny);
				}
			}
		}
	}
	
	static void countSafetyArea() {
		int tmpSafetyArea = 0;
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(tmpMap[i][j]==0) {
					tmpSafetyArea++;
				}
			}
		}
		if(safetyArea < tmpSafetyArea) {
			safetyArea = tmpSafetyArea;
		}
	}
}
