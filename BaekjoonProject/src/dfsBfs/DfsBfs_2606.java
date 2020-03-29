package dfsBfs;

import java.util.Scanner;

public class DfsBfs_2606 {
	static int computer, connection;
	static int map[][];
	static int visited[];
	static int count;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		computer = scan.nextInt();
		connection = scan.nextInt();
		map = new int[computer + 1][computer + 1];
		visited = new int[computer + 1];
		for (int i = 0; i < connection; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			map[a][b] = map[b][a] = 1;
		}
		scan.close();

		dfs(1);
		System.out.println(count);
	}

	static void dfs(int start) {
		visited[start] = 1;
		for (int i = 1; i < computer + 1; i++) {
			if (map[start][i] == 1 && visited[i] == 0) {
				dfs(i);
				count++;
			}
		}
	}
}