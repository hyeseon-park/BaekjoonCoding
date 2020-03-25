package bruteForce;

import java.util.Scanner;

public class BruteForce_14889 {
	static int[][] arr;
	static boolean[] visited;
	static int n;
	static int gap;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		gap = Integer.MAX_VALUE;
		n = scan.nextInt();
		arr = new int[n][n];
		visited = new boolean[n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		scan.close();
		chooseStartTeam(0, 0);
		System.out.println(gap);
	}

	static void chooseStartTeam(int start, int depth) {
		if (depth == n / 2) {
			gap = Math.min(gap, getGap());
			return;
		}
		for (int i = start; i < n; i++) {
			if (visited[i] != true) {
				visited[i] = true;
				chooseStartTeam(i + 1, depth + 1);
				visited[i] = false;
			}
		}
	}

	static int getGap() {
		int startTeamSum = 0;
		int linkTeamSum = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (visited[i] && visited[j]) {
					startTeamSum += arr[i][j];
				}
				if (visited[i] != true && visited[j] != true) {
					linkTeamSum += arr[i][j];
				}
			}
		}
		return Math.abs(startTeamSum - linkTeamSum);
	}
}
