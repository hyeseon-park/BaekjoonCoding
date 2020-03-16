package dfsBfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DfsBfs_2178 {
	static int n;
	static int m;
	static int[][] maze;
	static boolean[][] visited;
	static int[] dx = {1, -1, 0, 0};
	static int[] dy = {0, 0, 1, -1};
	static int spaceCount;
	static int stoi(String s) {
		return Integer.parseInt(s);
	}
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		m = scan.nextInt();
		scan.nextLine();
		maze = new int[n][m];
		visited = new boolean[n][m];
		for(int i=0; i<n; i++) {
			String line = scan.nextLine();
			for(int j=0; j<m; j++) {
				maze[i][j] = stoi(line.charAt(j)+"");
				visited[i][j] = false;
			}
		}
		visited[0][0]=true;
		bfs(0, 0);
		System.out.println(maze[n-1][m-1]);
	}
	static void bfs(int x, int y) {
		Queue<Dot> q = new LinkedList<Dot>();
		q.add(new Dot(x, y));
		while(!q.isEmpty()) {
			Dot dot = q.poll();
			for(int i=0; i<4; i++) {
				int nextX = dot.x+dx[i];
				int nextY = dot.y+dy[i];
				if(nextX<0 || nextX>=n || nextY<0 || nextY>=m) { //범위를 넘어가는 경우
					continue;
				}
				if(visited[nextX][nextY] || maze[nextX][nextY] == 0) { //방문한 경우 or 벽인 경우
					continue;
				}
				q.add(new Dot(nextX, nextY));
				maze[nextX][nextY] = maze[dot.x][dot.y]+1;
				visited[nextX][nextY] = true;
			}
		}
	}
}
class Dot {
	int x;
	int y;
	Dot(int x, int y) {
		this.x = x;
		this.y = y;
	}	
}