package bruteForce;

import java.util.Scanner;

public class BruteForce_7568 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int[][] bodies = new int[n][2];
		int[] ranks = new int[n];
		for (int i = 0; i < n; i++) {
			bodies[i][0] = scan.nextInt();
			bodies[i][1] = scan.nextInt();
		}
		scan.close();

		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (bodies[i][0] < bodies[j][0] && bodies[i][1] < bodies[j][1]) {
					ranks[i] += 1;
				} else if (bodies[i][0] > bodies[j][0] && bodies[i][1] > bodies[j][1]) {
					ranks[j] += 1;
				}
			}
		}

		for (int rank : ranks) {
			System.out.print(rank + 1 + " ");
		}
	}
}
