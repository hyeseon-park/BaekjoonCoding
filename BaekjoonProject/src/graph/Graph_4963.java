package graph;

import java.util.Scanner;

public class Graph_4963 {
	static int[] dx = {0,0,1,-1,1,-1,1,-1};
	static int[] dy = {-1,1,0,0,-1,1,1,-1};
	static int[][] map;
	static int island;
	static int w, h;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			w = scan.nextInt();
			h = scan.nextInt();
			if(w == 0 && h == 0) break;
			map = new int[h][w];
			for(int i=0; i<h; i++) {
				for(int j=0; j<w; j++) {
					map[i][j] = scan.nextInt();
				}
			}
			island = 0;
			for(int i=0; i<h; i++) {
				for(int j=0; j<w; j++) {
					if(map[i][j] == 1) {
						island++;
						searchMap(i, j);
					}
				}
			}
			System.out.println(island);
		}
		scan.close();
	}
	
	static void searchMap(int x, int y) {
		map[x][y] = 0;
		for(int i=0; i<8; i++) {
			int nextX = x + dx[i];
			int nextY = y + dy[i];
			if(nextX >= 0 && nextY >= 0 && nextX < h && nextY < w) {
				if(map[nextX][nextY]==1) {
					searchMap(nextX, nextY);
				}
			}
		}
	}
}
